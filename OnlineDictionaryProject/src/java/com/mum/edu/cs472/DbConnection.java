/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.edu.cs472;

import java.sql.*;

import javax.naming.spi.DirStateFactory;

/**
 *
 * @author 985219
 */
public class DbConnection {

    public static Connection getConnection() {

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/entries", "root", "root");
        return con;
    }

    public static ResultSet getWords(String word) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/entries", "root", "root");

//here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM entries where lower(word)=Lower('"+word+"');");
                       
            return rs;

        } catch (Exception e) {
            System.out.println(e);
        }
        
        return null;
    }

}

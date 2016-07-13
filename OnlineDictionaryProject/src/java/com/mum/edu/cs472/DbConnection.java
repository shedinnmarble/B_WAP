/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.edu.cs472;

import com.google.gson.Gson;
import java.sql.*;
import java.util.*;

import javax.naming.spi.DirStateFactory;
import org.apache.commons.dbutils.*;
import org.apache.commons.dbutils.handlers.MapListHandler;

/**
 *
 * @author 985219
 */
public class DbConnection {

    public static Connection getConnection() {

        //
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/entries", "root", "root");

            return con;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static ResultSet getWords(String word) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/entries", "root", "root");

//here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM entries where lower(word)=Lower('" + word + "');");

            return rs;

        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public static String resultSetToJson(String word) {
        try {
//            Thread.sleep(8000);
        } catch (Exception e) {
        }
        Connection connection = getConnection();
        List<Map<String, Object>> listOfMaps = null;
        String query = "SELECT * FROM entries where lower(word)=Lower(?);";
        try {
            QueryRunner queryRunner = new QueryRunner();

            listOfMaps = queryRunner.query(connection, query, word, new MapListHandler());
        } catch (SQLException se) {
            throw new RuntimeException("Couldn't query the database.", se);
        } finally {
            DbUtils.closeQuietly(connection);
        }
        return new Gson().toJson(listOfMaps);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu;

import static com.sun.faces.util.CollectionsUtils.map;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 985219
 */
@WebServlet(name = "CalculatorImproved", urlPatterns = {"/CalculatorImproved"})
public class CalculatorImproved extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doTrace(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doOptions(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doHead(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected long getLastModified(HttpServletRequest req) {
        return super.getLastModified(req); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getServletName() {
        return super.getServletName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void log(String message, Throwable t) {
        super.log(message, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void log(String msg) {
        super.log(msg); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServletContext getServletContext() {
        return super.getServletContext(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServletConfig getServletConfig() {
        return super.getServletConfig(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enumeration<String> getInitParameterNames() {
        return super.getInitParameterNames(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInitParameter(String name) {
        return super.getInitParameter(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroy() {
        super.destroy(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calculator</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Calculator at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       processRequest(request, response);
       
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         String plasA=request.getParameter("plusA");
       String plasB=request.getParameter("plusB");
       String multiplyA=request.getParameter("multiplyA");
       String multiplyB=request.getParameter("multiplyB");
       PrintWriter out = response.getWriter();
      response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        HashMap<String,Integer> resultList=new HashMap<>();
       if(!plasA.isEmpty()&&!plasB.isEmpty()){
           try{
           int result=Integer.parseInt(plasA)+Integer.parseInt(plasB);
           resultList.put("plus", result);
         //  out.printf(String.format("<span>%s+%s = %s</span>", plasA,plasB,result) );
           }catch(Exception e){
          // out.printf(e.getMessage());
           }
       }
       if(!multiplyA.isEmpty()&&!multiplyB.isEmpty()){
       try{
       int result=Integer.parseInt(multiplyA)*Integer.parseInt(multiplyB);
       resultList.put("mutilply", result);
      // out.printf("<br/><span>%s*%s=%d</span>",multiplyA,multiplyB,result);
       }
       catch(Exception e){
        // out.print(e.getMessage());}
     
       }
       out.print(resultList);
    }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head><title>A First JSP page</title></head>\n");
      out.write("<body><h1>A short JSP example</h1>\n");
      out.write("    ");


        String plasA=request.getParameter("plusA");
       String plasB=request.getParameter("plusB");
       String multiplyA=request.getParameter("multiplyA");
       String multiplyB=request.getParameter("multiplyB");
     
       if(plasA!=null&&!plasA.isEmpty()&&!plasB.isEmpty()){
           try{
           int result=Integer.parseInt(plasA)+Integer.parseInt(plasB);
          request.setAttribute("plusRequest", result);
           }catch(Exception e){
         
           }
       }else{
        request.setAttribute("plusRequest", "");
       }
       if(multiplyA!=null&&!multiplyA.isEmpty()&&!multiplyB.isEmpty()){
       try{
       int result=Integer.parseInt(multiplyA)*Integer.parseInt(multiplyB);
        request.setAttribute("plusRequest", result);
      // out.printf("<br/><span>%s*%s=%d</span>",multiplyA,multiplyB,result);
       }
       catch(Exception e){
         out.print(e.getMessage());}
     
       }else{
        request.setAttribute("plusRequest", "");
       }
       


      out.write("\n");
      out.write(" <form  method=\"post\" id=\"myForm\">\n");
      out.write("        <div class=\"plus\">\n");
      out.write("            <p><input type=\"text\" value=\"\" name=\"plusA\" value=\"\"><span>+</span>\n");
      out.write("                <input type=\"text\" value=\"\" name=\"plusB\">\n");
      out.write("                <span>=</span><input type=\"text\" id=\"plusResult\" value=\"");
 out.print(request.getAttribute("plusRequest")); 
      out.write("\"/>\n");
      out.write("                </p>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"multiply\">\n");
      out.write("            <p><input type=\"text\" value=\"\" name=\"multiplyA\"><span>*</span>\n");
      out.write("                <input type=\"text\" value=\"\" name=\"multiplyB\">\n");
      out.write("               <span>=</span><input type=\"text\" id=\"multiplyResult\"/>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <div><input type=\"submit\" value=\"Submit\" id=\"submit\"/></div>\n");
      out.write("        <div id=\"result\"></div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("Copyright, Well House Consultants\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

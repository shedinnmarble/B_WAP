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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head><title>Calculator</title></head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");


        String plasA=request.getParameter("plusA");
       String plasB=request.getParameter("plusB");
        String multiplyA=request.getParameter("multiplyA");
       String multiplyB=request.getParameter("multiplyB");
     
       if(plasA!=null&&!plasA.isEmpty()&&!plasB.isEmpty()){
           try{
           int result=Integer.parseInt(plasA)+Integer.parseInt(plasB);
          request.setAttribute("plusRequest", result);
          request.setAttribute("plusA",plasA);
             request.setAttribute("plusB",plasB);
           }catch(Exception e){
         
           }
       }else{
        request.setAttribute("plusRequest", "");
         request.setAttribute("plusA",plasA);
            request.setAttribute("plusB",plasB);
       }
       if(multiplyA!=null&&!multiplyA.isEmpty()&&!multiplyB.isEmpty()){
       try{
       int result=Integer.parseInt(multiplyA)*Integer.parseInt(multiplyB);
        request.setAttribute("mutilplyResult", result);
           request.setAttribute("multiplyA",multiplyA);
            request.setAttribute("multiplyB",multiplyB);
      // out.printf("<br/><span>%s*%s=%d</span>",multiplyA,multiplyB,result);
       }
       catch(Exception e){
         out.print(e.getMessage());}
     
       }else{
        request.setAttribute("mutilplyResult", "");
         request.setAttribute("multiplyA",multiplyA);
            request.setAttribute("multiplyB",multiplyB);
       }
       


      out.write("\r\n");
      out.write(" <form  method=\"post\" id=\"myForm\">\r\n");
      out.write("        <div class=\"plus\">\r\n");
      out.write("            <p><input type=\"text\"  name=\"plusA\" value=\"");
 out.print(request.getAttribute("plusA")==null?"":request.getAttribute("plusA")); 
      out.write("\" /><span>+</span>\r\n");
      out.write("                <input type=\"text\" value=\"");
 out.print(request.getAttribute("plusB")==null?"":request.getAttribute("plusB")); 
      out.write("\" name=\"plusB\">\r\n");
      out.write("                <span>=</span><input type=\"text\" id=\"plusResult\" value=\"");
 out.print(request.getAttribute("plusRequest")); 
      out.write("\"/>\r\n");
      out.write("                </p>\r\n");
      out.write("        </div>\r\n");
      out.write("         <div class=\"multiply\">\r\n");
      out.write("            <p><input type=\"text\" value=\"");
 out.print(request.getAttribute("multiplyA")==null?"":request.getAttribute("multiplyA")); 
      out.write("\" name=\"multiplyA\"><span>*</span>\r\n");
      out.write("                <input type=\"text\" value=\"");
 out.print(request.getAttribute("multiplyB")==null?"":request.getAttribute("multiplyB")); 
      out.write("\" name=\"multiplyB\">\r\n");
      out.write("                <span>=</span><input type=\"text\" id=\"multiplyResult\" value=\"");
 out.print(request.getAttribute("mutilplyResult")); 
      out.write("\" />\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div><input type=\"submit\" value=\"Submit\" id=\"submit\"/></div>\r\n");
      out.write("        <div id=\"result\"></div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

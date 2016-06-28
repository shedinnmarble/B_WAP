<%-- 
    Document   : index
    Created on : Jun 26, 2016, 4:39:54 PM
    Author     : yafen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head><title>Calculator</title></head>
<body>
    <%

        String plasA=request.getParameter("plusA");
       String plasB=request.getParameter("plusB");
        String multiplyA=request.getParameter("multiplyA");
       String multiplyB=request.getParameter("multiplyB");
     
       if(plasA!=null&&!plasA.isEmpty()&&!plasB.isEmpty()){
           try{
           int result=Integer.parseInt(plasA)+Integer.parseInt(plasB);
          request.setAttribute("plusRequest", result);
          //request.setAttribute("plusA",plasA);
           //  request.setAttribute("plusB",plasB);
           }catch(Exception e){
         
           }
       }else{
        request.setAttribute("plusRequest", "");
        // request.setAttribute("plusA",plasA);
           // request.setAttribute("plusB",plasB);
       }
       if(multiplyA!=null&&!multiplyA.isEmpty()&&!multiplyB.isEmpty()){
       try{
       int result=Integer.parseInt(multiplyA)*Integer.parseInt(multiplyB);
        request.setAttribute("mutilplyResult", result);
         //  request.setAttribute("multiplyA",multiplyA);
           // request.setAttribute("multiplyB",multiplyB);
      // out.printf("<br/><span>%s*%s=%d</span>",multiplyA,multiplyB,result);
       }
       catch(Exception e){
         out.print(e.getMessage());}
     
       }else{
        request.setAttribute("mutilplyResult", "");
       //  request.setAttribute("multiplyA",multiplyA);
          //  request.setAttribute("multiplyB",multiplyB);
       }
       

%>
<form  method="get" id="myForm" action="index.jsp?a=<%out.print(plasA);%>">
        <div class="plus">
            <p><input type="text"  name="plusA" value="<% out.print(request.getParameter("plusA")==null?"":request.getParameter("plusA")); %>" /><span>+</span>
                <input type="text" value="<% out.print(request.getParameter("plusB")==null?"":request.getParameter("plusB")); %>" name="plusB">
                <span>=</span><input type="text" id="plusResult" value="<% out.print(request.getAttribute("plusRequest")); %>"/>
                </p>
        </div>
         <div class="multiply">
            <p><input type="text" value="<% out.print(request.getParameter("multiplyA")==null?"":request.getParameter("multiplyA")); %>" name="multiplyA"><span>*</span>
                <input type="text" value="<% out.print(request.getParameter("multiplyB")==null?"":request.getParameter("multiplyB")); %>" name="multiplyB">
                <span>=</span><input type="text" id="multiplyResult" value="<% out.print(request.getAttribute("mutilplyResult")); %>" />
            </p>
        </div>
        <div><input type="submit" value="Submit" id="submit"/></div>
        <div id="result"></div>
 </form>

</body>
</html>


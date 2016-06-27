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
       

%>
 <form  method="post" id="myForm">
        <div class="plus">
            <p><input type="text"  name="plusA" value="<% out.print(request.getAttribute("plusA")==null?"":request.getAttribute("plusA")); %>" /><span>+</span>
                <input type="text" value="<% out.print(request.getAttribute("plusB")==null?"":request.getAttribute("plusB")); %>" name="plusB">
                <span>=</span><input type="text" id="plusResult" value="<% out.print(request.getAttribute("plusRequest")); %>"/>
                </p>
        </div>
         <div class="multiply">
            <p><input type="text" value="<% out.print(request.getAttribute("multiplyA")==null?"":request.getAttribute("multiplyA")); %>" name="multiplyA"><span>*</span>
                <input type="text" value="<% out.print(request.getAttribute("multiplyB")==null?"":request.getAttribute("multiplyB")); %>" name="multiplyB">
                <span>=</span><input type="text" id="multiplyResult" value="<% out.print(request.getAttribute("mutilplyResult")); %>" />
            </p>
        </div>
        <div><input type="submit" value="Submit" id="submit"/></div>
        <div id="result"></div>
        </form>

</body>
</html>


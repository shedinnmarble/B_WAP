<%-- 
    Document   : Index.jsp
    Created on : Jun 28, 2016, 12:11:57 PM
    Author     : 985219
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<% String[][] data = {{"Nov 6", "32", "26"},{"Nov 7", "32", "26"},{"Nov 8", "32", "26"}};
request.setAttribute("temperatures", data);%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
       <table>
<tr><th>DATE</th><th>HIGH</th><th>LOW</th></tr>
<c:forEach var="daily" items="${temperatures}">
 <tr>
 <td>${daily[0]}</td><td>${daily[1]}</td><td>${daily[2]}</td>
 </tr>
</c:forEach>
</table>
    </body>
</html>

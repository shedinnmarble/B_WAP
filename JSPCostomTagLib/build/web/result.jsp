<%-- 
    Document   : result
    Created on : Jun 28, 2016, 10:05:59 PM
    Author     : yafen
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Beer Recommends Center </h1>
        <p>
            <%
//            List styles=(List)request.getAttribute("styles");
//            Iterator it=styles.iterator();
//            while(it.hasNext()){
//            out.print("<br/>try:"+it.next());
//            }
            %>
            <c:forEach var="color" items="${styles}">
                <br/>try :"${color}
            </c:forEach>
            
        </p>
    </body>
</html>

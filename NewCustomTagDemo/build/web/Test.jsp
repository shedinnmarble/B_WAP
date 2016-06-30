<%-- 
    Document   : Test
    Created on : Jun 28, 2016, 10:46:20 PM
    Author     : yafen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mytag" uri="/WEB-INF/tlds/HEAD.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <mytag:Head thecolor="red" words="This is costom Tag for h1, with color attribute"/>
        <mytag:Head words="This is costom Tag for h1, without color attribute"/>
    </body>
</html>

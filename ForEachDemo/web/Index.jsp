<%-- 
    Document   : Index.jsp
    Created on : Jun 28, 2016, 12:11:57 PM
    Author     : 985219
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%String[][] data = {{"Nov 6", "32", "26"}, {"Nov 7", "32", "26"}, {"Nov 8", "32", "26"}};
    request.setAttribute("temperatures", data);%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
        <%
            String[][] temperatures = (String[][]) request.getAttribute("temperatures");
            for (String[] arr : temperatures) {
                out.print("<tr>");
                out.print(String.format("<td>%s</td><td>%s</td><td>%s</td>", arr[0], arr[1], arr[2]));
                out.print("</tr>");
            }
        %>
        </table>
        <h1>Hello World!</h1>




        <a href='TableServlet'>View student table</a>

    </table>
</body>
</html>

<%-- 
    Document   : index
    Created on : Jun 28, 2016, 10:16:56 AM
    Author     : 985219
--%>

<%@page import="mum.edu.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Quiz q;
    //first time to load the page
    if (request.getParameter("qIndex") == null) {
        q = new Quiz();
        request.getSession().setAttribute("quiz", q);
    } else {
        q = (Quiz) request.getSession().getAttribute("quiz");
        try {
            q.doPost(request, response);
            q = (Quiz) request.getSession().getAttribute("quiz");

        } catch (Exception e) {
            out.println(e.getMessage());
        }
    }


%>
<%! public void jspInit() {

//your initialization code} 
//Quiz q = (Quiz)request.getSession().getAttribute("quiz");
    }%> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Quiz</title>
    </head>
    <body>
        <form method="post">
            <h1>The Number Quiz</h1>
            <p>Your current score is <%=q.getScore()%>.</p>
            <% if (!q.isTheLastOne()) {%>
            <p>Guess the next number in the sequence.</p>
            <p><%=q.getQuestion()%></p>
            <p>Your answer:<input type="text" name="answer"></p>
            <input type="submit" value="submit">
            <input type="hidden" value="<%=q.getqIndex()%>" name="qIndex">
            <%} else {%>
            <p>you have finished the Number Quiz, your score is <%=q.getScore()%> out of <%=q.getQuestionNumber()%></p>
            <%}%>
        </form>
    </body>
</html>

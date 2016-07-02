<%-- 
    Document   : form
    Created on : Jun 28, 2016, 10:11:28 PM
    Author     : yafen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Selection Page</title>
    </head>
    <body>
        <form action="SelectBeer.doyouKnow" method="post">
            Select Beer Color<p>
                Color:
                <select name="color" size="1">
                    <option>Light</option>
                    <option>amber</option>
                    <option>Brown</option>
                    <option>Dark</option>
                </select>
            </p>
            <input type="submit" value="submit"/>
        </form>
    </body>
</html>

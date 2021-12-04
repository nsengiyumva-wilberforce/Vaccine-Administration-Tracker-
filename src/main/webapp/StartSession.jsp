<%-- 
    Document   : StartSession
    Created on : Dec 3, 2021, 3:46:04 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Session</title>
    </head>
    <body>
        <%
            //start session
            if(request.getParameter("S")!=null){
                session.setAttribute("start", "start");
            }
            response.sendRedirect("healthcentres");
            %>
    </body>
</html>

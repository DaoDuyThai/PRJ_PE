<%-- 
    Document   : index.jsp
    Created on : Jul 9, 2024, 8:50:40 PM
    Author     : DUYTHAI
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="index.css">
    </head>
    <body>
        <div class="container">
            <div class="table-container">
                <div class="list-header">
                    LIST OF CODES
                </div>
                <c:forEach var="id" items="${playerIds}">
                    <div class="list-item">
                        <a href="show?id=${id}">${id}</a>
                    </div>
                </c:forEach>

            </div>
            <div class="information-container">
                <div class="info-header">
                    INFORMATION OF PLAYER
                </div>
                <form action="show" method="post">
                    <div class="form-group">
                        <label for="code">Code:</label>
                        <input type="text" name="code" value="${player.code}" readonly="">
                    </div>
                    <div class="form-group">
                        <label for="code">Name:</label>
                        <input type="text" name="name" value="${player.name}" readonly="">
                    </div>
                    <div class="form-group">
                        <label for="code">Position:</label>
                        <input type="text" name="position" value="${player.position}" readonly="">
                        <button class="delete-button" type="submit">DELETE</button> 
                    </div>
                    <div class="form-group">
                        <label for="code">Salary:</label>
                        <input type="text" name="salary" value="${player.salary}" readonly="">
                    </div>
                    <div class="form-group">
                        <label for="code">Team:</label>
                        <input type="text" name="team" value="${player.team}" readonly="">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>

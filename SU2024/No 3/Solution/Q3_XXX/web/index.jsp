<%-- 
    Document   : index.jsp
    Created on : Jul 8, 2024, 9:05:42 PM
    Author     : DUYTHAI
--%>

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
                <div class="list-header">LIST OF CODES</div>
                <div class="list-item"><a href="#">P001</a></div>
                <div class="list-item"><a href="#">P002</a></div>
                <div class="list-item"><a href="#">P003</a></div>
                <div class="list-item"><a href="#">P004</a></div>
                <div class="list-item"><a href="#">P005</a></div>
                <div class="list-item"><a href="#">P006</a></div>
                <div class="list-item"><a href="#">P007</a></div>
                <div class="list-item"><a href="#">P008</a></div>
            </div>
            <div class="information-container">
                <div class="info-header">INFORMATION OF PLAYER</div>
                <form>
                    <div class="form-group">
                        <label for="code">Code:</label>
                        <input type="text" id="code" name="code">
                    </div>
                    <div class="form-group">
                        <label for="name">Name:</label>
                        <input type="text" id="name" name="name">
                    </div>
                    <div class="form-group position-group">
                        <label for="position">Position:</label>
                        <input type="text" id="position" name="position">
                        <input type="submit" value="DELETE" class="delete-button">
                    </div>
                    <div class="form-group">
                        <label for="salary">Salary:</label>
                        <input type="text" id="salary" name="salary">
                    </div>
                    <div class="form-group">
                        <label for="team">Team:</label>
                        <input type="text" id="team" name="team">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>

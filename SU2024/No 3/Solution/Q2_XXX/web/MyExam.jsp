<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="margin: auto">
            <form style="margin: auto" action="PlayerController" method="post">
                <table>
                    <tr>
                        <td colspan="2" style="text-align: center">PLAYER INFORMATION</td>
                    </tr>
                    <tr>
                        <td>Code:</td>
                        <td><input type="text" name="code"></td>
                    </tr>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="name"></td>
                    </tr>
                    <tr>
                        <td>Position:</td>
                        <td>
                            <select name="position">
                                <option value="striker">Striker</option>
                                <option value="goalkeeper">Goalkeeper</option>
                                <option value="defender">Defender</option>
                                <option value="midfielder">Midfielder</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Salary:</td>
                        <td><input type="text" name="salary"></td>
                    </tr>
                    <tr> 
                        <td style="text-align: center" colspan="2"><input type="submit" value="CREATE" name="create"></td>
                    </tr>
                    <tr>
                        <td colspan="2" style="color: red"><i></i></td>
                    </tr>
                    <tr>
                    </tr>
                </table>
                <p style="color: red">${errorMessage}</p>
                <table border="1">
                    <tr>
                        <td>Code</td>
                        <td>Name</td>
                        <td>Position</td>
                        <td>Salary</td>
                    </tr>
                    <c:forEach var="player" items="${players}">
                        <tr>
                            <td>${player.code}</td>
                            <td>${player.name}</td>
                            <td>${player.position}</td>
                            <td>${player.salary}</td>
                        </tr>
                    </c:forEach>
                </table>
            </form>
        </div>
    </body>
</html>

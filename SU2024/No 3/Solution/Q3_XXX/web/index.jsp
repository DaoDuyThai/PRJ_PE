<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <c:forEach var="pid" items="${playerIds}">
                    <div class="list-item"><a href="show?id=${pid}">${pid}</a></div>
                    </c:forEach>
            </div>
            <div class="information-container">
                <div class="info-header">INFORMATION OF PLAYER</div>
                <form action="show" method="post">
                    <div class="form-group">
                        <label for="code">Code:</label>
                        <input type="text" id="code" name="code" readonly value="${playerInfo.playerId}">
                    </div>
                    <div class="form-group">
                        <label for="name">Name:</label>
                        <input type="text" id="name" name="name" readonly readonly value="${playerInfo.playerName}">
                    </div>
                    <div class="form-group position-group">
                        <label for="position">Position:</label>
                        <input type="text" id="position" name="position" readonly readonly value="${playerInfo.position}">
                        <button class="delete-button" type="submit">DELETE</button>
                    </div>
                    <div class="form-group">
                        <label for="salary">Salary:</label>
                        <input type="text" id="salary" name="salary" readonly readonly value="${playerInfo.salary}">
                    </div>
                    <div class="form-group">
                        <label for="team">Team:</label>
                        <input type="text" id="team" name="team" readonly readonly value="${playerInfo.teamName}">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>

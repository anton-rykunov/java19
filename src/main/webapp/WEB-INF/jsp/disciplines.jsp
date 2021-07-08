<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Дисциплины</title>
    <link rel="stylesheet" href="../../resources/css/students.css?v=13">
    <script type="text/javascript" src="../../resources/js/function.js?v=13" charset="UTF-8"></script>
</head>
<body>
<div class="first">
    <h1>Система управления студентами и их успеваемостью</h1>
</div>
<div class="second">
    <div class="left-side">
        <a href="">Logout</a>
        <a href="/index.jsp">На главную</a>
    </div>
    <div class="midle-side">
        <h3>Список дисциплин</h3>
        <div class="entry-midle-side">
            <table>
                <tr>
                    <th></th>
                    <th>Название дисциплины</th>
                </tr>
                <c:forEach items="${disciplines}" var="disc">
                    <tr>
                        <td><input type="checkbox" value="${disc.id}"></td>
                        <td>${disc.discipline}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <div class="right-side">
        <form action="/dis-creat" method="get">
            <input class="btn" type="submit" value="Создать дисциплину...">
        </form>
        <input class="btn" type="submit" onclick="modifyDiscipline()" value="Модифицировать выбранную дисциплину">
        <input class="btn" type="submit" onclick="deleteDisciplines()" value="Удалить выбранные дисциплины">
    </div>
</div>
<form id="formModify" action="/discipline-modify" method="get">
    <input type="hidden" id="hiddenModify" name="hiddenModify">
</form>
<form id="formDelete" action="/discipline-delete" method="post">
    <input type="hidden" id="hiddenDelete" name="hiddenDelete">
</form>

</body>
</html>

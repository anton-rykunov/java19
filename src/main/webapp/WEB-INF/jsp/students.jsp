<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <link rel="stylesheet" href="../../resources/css/students.css">
    <script type="text/javascript" src="../../resources/js/function.js?v=13" charset="UTF-8"></script>
    <title>Студенты</title>

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
    <div class="first-row">

        <input class="btn" type="submit" value="Просмотреть успеваемость выбранных студентов">

        <form action="/student-creat" method="get">
            <input class="btn" type="submit" value="Создать студента">
        </form>
    </div>
    <div class="second-row">
        <input onclick="deleteStudents()" class="btn" type="submit" value="Удалить выбранного студента">

        <input class="btn" type="submit" value="Модифицировать выбранного студента">

    </div>
</div>
<div class="third">
    <table class="student-table">
        <tr>
            <th></th>
            <th>Фамилия</th>
            <th>Имя</th>
            <th>Группа</th>
            <th>Дата поступления</th>
        </tr>
        <c:forEach items="${students}" var="stu">
            <tr>
                <td><input type="checkbox" value="${stu.id}"></td>
                <td>${stu.lastname}</td>
                <td>${stu.name}</td>
                <td>${stu.group}</td>
                <td>${stu.date}</td>
            </tr>
        </c:forEach>
    </table>
</div>

<form id="formDelete" action="/student-delete" method="post">
    <input type="hidden" id="hiddenDelete" name="hiddenDelete">
</form>
</body>
</html>

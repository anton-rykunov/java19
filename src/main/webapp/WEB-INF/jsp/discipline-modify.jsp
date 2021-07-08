
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Изменить выбранную дисциплину</title>
    <link rel="stylesheet" href="../../resources/css/students.css">
</head>
<body>
<div class="first">
    <h1>Система управления студентами и их успеваемостью</h1>
</div>
<div class="second">
    <div class="left-side">
        <a href="">Logout</a>
        <a href="/index.jsp">На главную</a>
        <a href="/disciplines">Назад</a>
    </div>
    <div class="midle-side-creat-dis">
        <h3>Для изменения введите новое значение и нажмите "Применить"</h3>
        <label>Название</label>
        <form action="/discipline-modify" method="post">
            <input type="hidden" name = "id" value="${disc.id}">
            <input type="text" name="disc" value="${disc.discipline}">
            <input class="btn" type="submit" value="Применить">
        </form>
    </div>
</div>
<c:if test="${message eq 'error'}">
    <h4>Поле не должно быть пустым!!!!!</h4>
</c:if>

</body>
</html>

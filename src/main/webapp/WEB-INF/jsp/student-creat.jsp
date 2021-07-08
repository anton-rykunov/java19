<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Создание студента</title>
    <link rel = "stylesheet" href="../../resources/css/students.css">
</head>
<body>
<div>
<h1>Для созданяи студента заполните все поля и нажмите "Создать"</h1>
</div>
<nav>
<a href="">logout</a>
<a href="/index.jsp">На главную</a>
<a href="/students">Назад</a>
</nav>
<div>
    <form action="/student-creat" method="post">
        <div>
            <label>Фамилия</label>
            <input type="text" name="newLastname">
        </div>
        <div>
            <label>Имя</label>
            <input type="text" name="newName">
            </div>
        <div>
            <label>Группа</label>
            <select>
                <option></option>
                <option></option>
            </select>
        </div>
        <div>
            <label>Дата поступления</label>
            <input type="date" name="newName">
        </div>
        <div>
        <input type="submit" value="Содать">
        </div>
    </form>
</div>


</form>

<c:if test="${message eq 'error'}">
    <h4>Поле не должно быть пустым!!!!!</h4>
</c:if>


</body>


</html>

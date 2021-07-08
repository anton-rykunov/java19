<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Изменение студента</title>
    <link rel = "stylesheet" href="../../resources/css/students.css">
</head>
<body>
<div>
    <h1>Для изменения данных студента внесите изменнеия и нажмите "Применить"</h1>
</div>
<nav>
    <a href="">logout</a>
    <a href="/index.jsp">На главную</a>
    <a href="/students">Назад</a>
</nav>
<div>
    <form action="/student" method="post">
        <div>
            <label>Фамилия</label>
            <input type="text" value="">
        </div>
        <div>
            <label>Имя</label>
            <input type="text" value="">
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
            <input type="date" value="">
        </div>
        <div>
            <input type="submit" value="Применить">
        </div>
    </form>
</div>
</body>
</html>

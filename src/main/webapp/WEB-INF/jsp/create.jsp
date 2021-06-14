
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Создание студента</title>
</head>
<body>
<a href="">logout</a>
<a href="/index.jsp">На главную</a>
<a href="/students">Назад</a>
<br>
<div>
    <table>
        <tr>Система ураоения студентами и их успеваемостью</tr>
    </table>
</div>
<br>
<form>
    <p>Для создания студента заполните все поля и нажмите кнопуку "Создать"</p>
    <p>Имя: <input name="text" required></p>
    <br>
    <p>Фамилия: <input type="text"  required></p>
    <br>
    <p>Группа: <input type="text"  required></p>
    <br>
    <p>Дата поступления: <input type="date"  required></p>
</form>
<br>
    <button type="submit">Создать</button>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Дисциплины</title>
    <link rel = "stylesheet" href="../../resources/css/studrnts.css">
</head>
<body>
<h1>Страница с дисциплинами</h1>
<table>
    <tr>
        <td></td>
        <td>Название дисциплины</td>
    </tr>
    <c:forEach items="${disciplines}" var="disc">
        <tr>
            <td><input type="checkbox"></td>
            <td>${disc.discipline}</td>
        </tr>
    </c:forEach>
</table>
<form action="/dis-creat" method="get">
<input type="submit" value="Создать дисциплину...">
</form>
<input type="submit" value="Модифицировать выбранную дисциплину">
<input type="submit" value="Удалить выбранную дисциплину">

</body>
</html>

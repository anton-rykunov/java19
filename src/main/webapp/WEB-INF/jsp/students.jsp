<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="">
    <title>Студенты</title>
    <style>
        .btn {
            display: inline-block; /* Строчно-блочный элемент */
            background: #8C959D; /* Серый цвет фона */
            padding: 1px;
            color: black; /* цвет текста */
            text-decoration: none; /* Убираем подчёркивание */
            border-radius: 2px; /* Скругляем уголки */
        }
    </style>
</head>
<body>
<a href="">Logout</a>
<a href="/index.jsp">На главную</a>
<div>
    <table>
        <tr>Система ураоения студентами и их успеваемостью</tr>
    </table>
</div>
<form action="" class="btn" target=_self">
    <button>Просмотреть успеваемость выбранных студентов</button>
</form>
<form action="/create-student" class="btn" target="_self">
    <button>Создать студента</button>
</form>
<form action="/mod" class="btn" target="_self">
    <button>Модифицировать выбранного студента</button>
</form>
<form action="" class="btn" target="_self">
    <button>Удалить выбранного студента</button>
</form>
<section>
    <div class="sheme-table">
        <table>
            <tr>
                <th></th>
                <th>Фамилия</th>
                <th>Имя</th>
                <th>Группа</th>
                <th>Дата поступления</th>
            </tr>
            <tr>
                <td><input type="checkbox"></td>
                <td>Сидоров</td>
                <td>Сидор</td>
                <td>К-221</td>
                <td>20 аперля 2021</td>
            </tr>
            <tr>
                <td><input type="checkbox"></td>
                <td>Сидоров</td>
                <td>Сидор</td>
                <td>К-221</td>
                <td>20 аперля 2021</td>
            </tr>
            <tr>
                <td><input type="checkbox"></td>
                <td>Сидоров</td>
                <td>Сидор</td>
                <td>К-221</td>
                <td>20 аперля 2021</td>
            </tr>
            <tr>
                <td><input type="checkbox"></td>
                <td>Сидоров</td>
                <td>Сидор</td>
                <td>К-221</td>
                <td>20 аперля 2021</td>
            </tr>
        </table>
    </div>
</section>

</body>
</html>

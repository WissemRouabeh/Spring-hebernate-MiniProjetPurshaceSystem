<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>Commandes</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<body>

<table class="table table-striped">
    <thead>
    <tr>
        <th>ID</th>

        <th>Numero</th>

        <th>Status</th>

        <th>Date </th>
        
        <th>EmailClient</th>
        
        

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${commandes}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.num}</td>
            <td>${c.status}</td>
            <td>${c.date_cmd}</td>
            <td>${c.client.email} </td>


        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>Produits</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<body>

<table class="table table-striped">
    <thead>
    <tr>
        <th>ID</th>
        <th>Code</th>
        <th>Categorie</th>
        <th>Quantite</th>
        <th>NumeroCommande</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${produits}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.code}</td>
            <td>${p.categorie}</td>
            <td>${p.qty}</td>
            <td>${p.commande.num}</td>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
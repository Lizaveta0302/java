<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Internet Shop</title>
</head>
<body>
<div style="margin: auto; text-align: center">
    <h1>List of products: </h1>
    <ul>
        <c:forEach var="product" items="${products}">
            <li>
                <c:out value="${product}"/>
                <a style="color: red" href="/web/deleteProduct/${product.id}">
                    <button>Delete product</button>
                </a>
            </li>
        </c:forEach>
    </ul>
    <h3 style="text-align: center">Add product</h3>
    <br>
    <form method="post" action="/web/addProduct">
        <label for="name">Input name:</label>
        <input type="text" id="name" name="name">
        <label for="price">Input price:</label>
        <input type="text" id="price" name="price">
        <button type="submit">Save</button>
    </form>
</div>
</body>
</html>
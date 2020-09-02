<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="ui" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<ui:html title="Products list">
    <div style="margin: auto; text-align: center">
        <h1>List of products: </h1>
        <ul style="list-style-type: none">
            <p>Total products : ${fn:length(products)}</p>
            <c:forEach var="product" items="${products}">
                <li>
                    <c:out value="${fn:toUpperCase(product)}"/>
                    <a style="color: red" href="/web/deleteProduct/${product.id}">
                        <button>Delete product</button>
                    </a>
                </li>
            </c:forEach>
        </ul>
        <ui:addProduct/>
    </div>
</ui:html>

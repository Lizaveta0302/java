<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<ui:html title="Internet Shop">
    <div style="margin: auto">
        <h3>${pageContext.request.userPrincipal.name}</h3>
        <sec:authorize access="isAuthenticated()">
            <h4><a href="/bucket">My bucket</a></h4>
            <ul style="list-style-type: none">
                <c:forEach var="product" items="${bucket}">
                    <li>
                        <c:out value="${fn:toUpperCase(product.name)}"/>
                        <c:out value="${fn:toUpperCase(product.country)}"/>
                    </li>
                </c:forEach>
            </ul>
        </sec:authorize>
        <h4><a href="/products/listProducts">Products page</a></h4>
        <h4><a href="/">Go Home</a></h4>
    </div>
</ui:html>
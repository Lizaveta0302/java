<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<ui:html title="Internet Shop">
    <div style="margin: auto">
        <h3>${pageContext.request.userPrincipal.name}</h3>
        <sec:authorize access="!isAuthenticated()">
            <h4><a href="/login">Login</a></h4>
            <h4><a href="/registration">Registration</a></h4>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <h4><a href="/bucket/${pageContext.request.userPrincipal.name}">My bucket</a></h4>
            <h4><a href="/logout">Logout</a></h4>
        </sec:authorize>
        <sec:authorize access="hasAuthority('ROLE_ADMIN')">
            <h4><a href="/admin/adminPage">Admin Page</a></h4>
        </sec:authorize>
        <h4><a href="/products/listProducts">Products page</a></h4>
    </div>
</ui:html>
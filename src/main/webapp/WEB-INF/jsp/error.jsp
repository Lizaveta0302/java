<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<ui:html title="Internet Shop">
    <p>Something wrong! Go home!</p>
    <c:out value="${fn:toUpperCase(exc)}"/>
    <h4><a href="/">Go Home</a></h4>
</ui:html>
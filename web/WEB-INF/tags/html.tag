<%@ tag %>
<%@ attribute name="title" required="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <c:if test="${not empty title}">
        <title><spring:message code="${title}" text="${title}"/></title>
    </c:if>
</head>
<body>
<jsp:doBody/>
</body>
</html>
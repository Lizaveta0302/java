<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="ui" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ui:html title="Admin Page">
    <div>
        <table>
            <thead>
            <th>ID</th>
            <th>Username</th>
            <th>Password</th>
            <th>Roles</th>
            </thead>
            <c:forEach items="${allUsers}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>
                        <c:forEach items="${user.roles}" var="role">
                            ${role.name}
                        </c:forEach>
                    </td>
                    <td>
                        <form action="${pageContext.request.contextPath}/admin" method="post">
                            <input type="hidden" name="id" value="${user.id}">
                            <button type="submit">Delete</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <a href="/">Home</a>
    </div>
</ui:html>
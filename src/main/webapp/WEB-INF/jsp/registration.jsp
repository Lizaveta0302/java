<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ui" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<ui:html title="Registration">
    <form:form method="POST" modelAttribute="userForm">
        <h2>Registration</h2>
        <div>
            <form:input type="text" path="name" placeholder="Name"/>
        </div>
        <div>
            <form:input type="text" path="username" placeholder="Username"
                        autofocus="true"/>
            <form:errors path="username"/>
                ${usernameError}
        </div>
        <div>
            <form:input type="password" path="password" placeholder="Password"/>
        </div>
        <button type="submit">Registry</button>
    </form:form>
    <a href="/">Home</a>
</ui:html>
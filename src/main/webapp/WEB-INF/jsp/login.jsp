<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="ui" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<ui:html title="Login">
    <sec:authorize access="isAuthenticated()">
        <h4>You are authorized already.</h4>
        <h4><a href="/">Go Home</a></h4>
    </sec:authorize>
    <form method="POST" action="/login">
        <h2>Login</h2>
        <div>
            <div>
                <input name="username" type="text" placeholder="Username"
                       autofocus="true"/>
            </div>
            <div>
                <input name="password" type="password" placeholder="Password"/>
            </div>
            <button type="submit">Log In</button>
            <h4><a href="/registration">Registration</a></h4>
        </div>
    </form>
</ui:html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>startup</title>
</head>
<body>
    <p><font color="red">${errorMessage}</font></p>
    <form action="/startup/login" method="POST">
        Name : <input name="name" type="text" /> 
        Password : <input name="password" type="password" />
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" />
    </form>
</body>
</html>
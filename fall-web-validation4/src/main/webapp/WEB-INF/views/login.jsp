<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcom to saraya Tech</h1>
<h1><font color="read">${ErrorMessage} </font></h1>
<form action="/login.do" method="post">
UserName : <input type="text" name="name">
PasseWord : <input type="text" name="pass">
<input type="submit">
</form>
</body>
</html>
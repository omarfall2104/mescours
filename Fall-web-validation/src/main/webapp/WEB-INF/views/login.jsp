<%@  page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><font color="red">${errorMessage}</font></p>
<form action="/login.do" method="post">
userName : <input type="text" name=user>
password : <input type="text" name="pass">
<input type="submit">
</form>
</body>
</html>
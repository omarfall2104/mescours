<%@  page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><font color="read">${errorMessage}</font>
<h3>Hello welcome in my page web</h3>
<form action="/login.do" method="post">
firstName : <input type="text"name="cre" > <br> <br>
name : <input type="text"name="name" > <br> <br>
passWord : <input type="password"name="pass" > <br> <br>
<input type="submit">
</form>

</body>
</html>
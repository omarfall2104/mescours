<%@  page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Hello creates a new count</h3>
<p><font color="red">${errorMessage}</font></p>
<form action="/login.do" method="post">

FirstName : <input type="text" name="first"> <br><br>
Name : <input type="text" name="nam"> <br><br>
mail : <input type="text" name="email"> <br><br>
PassWord : <input type="password" name="pass"> <br><br>
<input type="submit">

</form>

</body>
</html>
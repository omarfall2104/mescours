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
<h3>Welcom to saraya Tech</h3> 
<form action="/login.do" method="post">
 name: <input type="text" name="nom">
 password; <input type="text" name="pass">
 <input type="submit">
</form>

</body>
</html>
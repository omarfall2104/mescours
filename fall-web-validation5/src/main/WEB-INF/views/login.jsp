<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Welcome to Saraya tech</h2>
<p><font color="read">${MesageError} </font>
<form action="/login.do" method="post">
	<section>
		<div>
			UserName : <input type="text" name="name">
			Password : <input type="text" name="pass">
			<input type="submit">
		</div>
	</section>
</form>
</body>
</html>
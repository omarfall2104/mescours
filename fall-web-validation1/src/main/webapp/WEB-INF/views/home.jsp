<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@  page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Hello ${nom} your password is ${pass} ok.</h3>
<p> her are our training courses</p>
${training}
<h3>Your new formation is ${formats}</h3>
ForEach:
<ol>
<c:forEach items="${training }" var="train">
<li>${train.name }</li>
</c:forEach>
</ol>
<form action="formation.do" method="post">
<input type="text" name="add" required>
<input type="submit" value="add formation">
</form>
</body>
</html>
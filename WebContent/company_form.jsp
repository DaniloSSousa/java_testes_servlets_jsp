<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/create" var="url" />

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Formulário</title>
</head>
<body>
	<form action="${ url }" method="post">
		<label for="comp-name">Nome:</label>
		<input type="text" id="comp-name" name="name" />
		<input type="submit" />
	</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet" type="text/css">
<title>Home Page</title>
</head>
<body>
	<h1>
		Welcome,
		<c:out value="${dojoName}" />
	</h1>
	<a href='/date'>Get the current date</a>
	<a href='time'>Get the current time</a>
	<script src="js/app.js"></script>
</body>
</html>
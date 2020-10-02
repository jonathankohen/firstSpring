<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet" type="text/css">
<title>Date</title>
</head>
<body onload="doAlert()">
	<h1>
		Current date: <span id="date"><c:out value="${currentDate}" /></span>
	</h1>
</body>
<script src="js/app.js"></script>
</html>
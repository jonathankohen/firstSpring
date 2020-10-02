<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet" type="text/css">
<title>Time</title>
</head>
<body onload="doAlertAgain()">
	<h1>
		Current time: <span id="time"><c:out value="${currentTime}" /></span>
	</h1>
</body>
<script src="js/app.js"></script>
</html>
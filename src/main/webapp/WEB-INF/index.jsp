<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="webjars/bootstrap/4.5.0/css/bootstrap.min.css"
	rel="stylesheet">
<link href="css/style.css" rel="stylesheet" type="text/css">
<title>Home Page</title>
</head>
<body>
	<div class="container">
		<div class="row mt-5 mb-3">
			<div class="col text-center">
				<h1>Welcome to the ${dojoName} Dojo!</h1>
			</div>
		</div>

		<div class="row">
			<div class="col-3 mx-auto mb-5">
				<div class="btn-group" role="group"
					aria-label="Directory Button Group">
					<a type="button" class="btn btn-secondary" href='/date'>Date</a> <a
						type="button" class="btn btn-secondary" href='time'>Time</a> <a
						type="button" class="btn btn-secondary" href='counter'>Counter</a>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-4 mx-auto">
				<form class="form-inline" action="/try_code" method="post">
					<label class="sr-only" for="formInput">What is the code?</label> <input
						name="codeInput" type="text" class="form-control mb-2 mr-sm-2"
						id="formInput" placeholder="What is the code?" />
					<button type="submit" class="btn btn-primary mb-2 text-uppercase">Try
						Code</button>
				</form>
				<p class="text-danger">${codeError}</p>
			</div>
		</div>
	</div>
	<script src="js/app.js"></script>
</body>
</html>
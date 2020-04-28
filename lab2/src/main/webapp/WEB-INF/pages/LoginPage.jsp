<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
	<h2>Login Page</h2>
	<form method="get" action="TrainingManagementSystem">
		<label> Username </label>
		<div>
			<input type="text" name="username">
		</div>

		<label>Password</label>
		<div>
			<input type="password" name="passwod">
		</div>
		<input type="submit" value="Login">
	</form>
</body>
</html>
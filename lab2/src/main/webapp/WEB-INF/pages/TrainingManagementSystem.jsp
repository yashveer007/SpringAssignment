<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
	<h2>Training Management System</h2>
	<form method="get">
		<label> Pick your operation</label>
		<div>
			<a href="AddTrainee">Add a Trainee</a>
		</div>
		<div>
			<a href="DeleteTrainee">Delete a Trainee</a>
		</div>
		<div>
			<a href="ModifyTrainee">Modify a Trainee</a>
		</div>
		<div>
			<a href="RetrieveTrainee">Retrieve a Trainee</a>
		</div>
		<div>
			<a href="processRetrieveAllTrainees">Retrieve all Trainees</a>
		</div>
	</form>
</body>
</html>
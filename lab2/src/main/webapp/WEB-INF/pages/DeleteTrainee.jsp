<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
	<h2>Delete Operation</h2>
	<form method="get" action="processDeleteTrainee">
		<label>Please enter trainee ID </label>
		<div>
			<input type="text" name="traineeid"> <input type="submit"
				value="delete">
		</div>
	</form>
	 <a href="TrainingManagementSystem">BACK</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
	<h2>Enter Trainee Details</h2>
	<form method="get" action="processAddTrainee">
		<label> ID </label>
		<div>
			<input type="number" name="traineeid">
		</div>

		<label>Name</label>
		<div>
			<input type="text" name="traineename">
		</div>

		<label>Domain</label>
		<div>

			<select name="traineedomain">
				<option value="Cloud">Cloud</option>
				<option value="FS">FS</option>

			</select>
		</div>
		<label>Location</label>
		<div>
			<input type="radio" name="traineelocation" value="Chennai"> <label>Chennai</label>
			<input type="radio" name="traineelocation" value="Banglore"> <label>Banglore</label>
			<input type="radio" name="traineelocation" value="Pune"> <label>Pune</label>
			<input type="radio" name="traineelocation" value="Mumbai"> <label>Mumbai</label>

		</div>
		<input type="submit" value="Add Trainee">
		 
	</form>
	 <a href="TrainingManagementSystem">BACK</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
	<h2>Modify Operation</h2>
	<form method="get" action="processModifyTrainee">
		<label>Please enter trainee ID </label>
		<div>
			<input type="text" name="traineeid"> <input type="submit"
				value="modify">
		</div>
		<table border="2">
<tr><td><h1>Trainee details</h1></td></tr>
 <tr><td>TrainingId</td><td><input type="number" name="traineeid" ></td></tr> 
 <tr><td>TrainingName</td><td><input type="text" name="traineename" value="${trainee.traineeName}"></td></tr> 
  <tr><td>TrainingDomain</td><td><input type="text" name="traineedomain" value="${trainee.traineeDomain}"></td></tr> 
   <tr><td>TrainingLocation</td><td><input type="text" name="traineelocation" value="${trainee.traineeLocation}"></td></tr>
   <tr><td><input type="submit" value="update"> 
</table>
	</form>
	 <a href="TrainingManagementSystem">BACK</a>
</body>
</html>
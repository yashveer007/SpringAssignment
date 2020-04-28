<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
	<h2>Trainee Details Retrieved Successfully!!!</h2>
	<table>
		<form>
			<table border="2">
				<tr>
					<th>Trainee ID</th>
					<th>Trainee Name</th>
					<th>Trainee Location</th>
					<th>Trainee Domain</th>
				</tr>
				<tr>
					<th>Id:${trainee.traineeId}</th>

					<th>Name:${trainee.traineeName}</th>
					
					<th>Location:${trainee.traineeLocation}</th>

					<th>Domain:${trainee.traineeDomain}</th>



				</tr>

				</form>
			</table>
			<a href="TrainingManagementSystem">BACK</a>
</body>
</html>
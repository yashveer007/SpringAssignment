<%@page import="org.cap.entities.Trainee"%>
<%@page import="java.util.List" isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
	<h2>All Trainee Details</h2>
	<form>
		<table border="2">
			<tr>
				<th>Trainee ID</th>
				<th>Trainee Name</th>
				<th>Trainee Location</th>
				<th>Trainee Domain</th>
			</tr>
			<c:forEach items="${traineelist}" var="trainee">
				<tr>
					<td>${trainee.traineeId}</td>
					<td>${trainee.traineeName}</td>
					<td>${trainee.traineeLocation}</td>
					<td>${trainee.traineeDomain}</td>

				</tr>
			</c:forEach>
		</table>
	</form>
	<a href="TrainingManagementSystem">BACK</a>
</body>
</html>
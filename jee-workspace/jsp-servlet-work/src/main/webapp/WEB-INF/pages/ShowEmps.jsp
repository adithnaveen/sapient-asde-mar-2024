<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sap"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">

		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<td>Salary</td>
			</tr>
		</thead>

		<tbody>

			<sap:forEach items="${EMPS}" var="emp">
				<tr>
					<td>${emp.empId }</td>
					<td>${emp.empName }</td>
					<td>${emp.empSal }</td>
				</tr>
			</sap:forEach>
		</tbody>
	</table>
</body>
</html>



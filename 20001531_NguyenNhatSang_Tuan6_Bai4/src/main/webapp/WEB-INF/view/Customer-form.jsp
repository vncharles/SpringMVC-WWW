<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		<table>
			<tr>
				<td>First name</td>
				<td><form:input path="fname" /> <form:errors path="fname" cssClass="errors"/> </td>
			</tr>
			<tr>
				<td>Last name</td>
				<td><form:input path="lname" /> <form:errors path="lname" cssClass="errors"/></td>
			</tr>
			<tr>
				<td>Free passes</td>
				<td><form:input path="freePasses" /> <form:errors path="freePasses" cssClass="errors"/></td>
			</tr>
			<tr>
				<td>Postal code</td>
				<td><form:input path="postalCode" /> <form:errors path="postalCode" cssClass="errors"/></td>
			</tr>
			<tr>
				<td>Course code</td>
				<td><form:input path="courseCode" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
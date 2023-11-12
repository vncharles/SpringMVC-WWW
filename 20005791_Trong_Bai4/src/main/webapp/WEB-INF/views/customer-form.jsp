<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<td>
				<form:input path="firstName"/>
			</td>
		</tr>
		<tr>
			<td>Last name (*)</td>
			<td>
				<form:input path="lastName"/>
				<form:errors path="lastName"></form:errors>
			</td>
		</tr>
		<tr>
			<td>Free passes</td>
			<td>
				<form:input path="freePasses"/>
				<form:errors path="freePasses"></form:errors>
			</td>
		</tr>
		<tr>
			<td>Postal code</td>
			<td>
				<form:input path="postalCode"/>
				<form:errors path="postalCode"></form:errors>
			</td>
		</tr>
		<tr>
			<td>Course code</td>
			<td>
				<form:input path="courseCode"/>
			</td>
		</tr>
		<tr>
			<td colspan="2"> <input type="submit" value="Submit" /> </td>
		</tr>
	</table>
</form:form>

</body>
</html>
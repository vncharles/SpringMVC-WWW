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
	<form:form action="processForm" modelAttribute="student">
		<table>
			<tr>
				<td>First name</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Last name</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><form:select path="country">
						<form:options items="${student.countryOptions}" />
					</form:select></td>
			</tr>
			<tr>
				<td>Favorite language</td>
				<td><form:radiobuttons path="favoriteLanguage"
						items="${student.favoriteLanguageOptions}" /></td>
			</tr>
			<tr>
				<td>Operating systems</td>
				<td><form:checkboxes path="operatingSystems"
						items="${student.operatingSystemOptions}" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
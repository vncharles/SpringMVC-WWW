<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>The Student is confirmed: ${student.firstName}
		${student.lastName}</p>
	<p>Country: ${student.country}</p>
	<p>Favorite language: ${student.favoriteLanguage}</p>
	<p>Operating systems:</p>
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
	<a href="showForm">Back to form</a>
</body>
</html>
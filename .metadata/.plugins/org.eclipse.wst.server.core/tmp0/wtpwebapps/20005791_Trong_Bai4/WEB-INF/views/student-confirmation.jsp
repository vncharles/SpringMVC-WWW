<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>The student is confirmed: ${student.firstName } ${student.lastName }</h2>
<p>Country: ${student.country }</p>
<p>Favorite language: ${student.favorileLanguage }</p>
<ul>
	<c:forEach items="${student.operatingSystems }" var="item">
		<li>${item }</li>
	</c:forEach>
</ul>

</body>
</html>
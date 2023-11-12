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

<h3>Customer infomation</h3>
<p>First name: ${customer.firstName }</p>
<p>Last name: ${customer.lastName }</p>
<p>Free passes: ${customer.freePasses }</p>
<p>Postal code: ${customer.postalCode }</p>
<p>Course code: ${customer.courseCode }</p>

</body>
</html>
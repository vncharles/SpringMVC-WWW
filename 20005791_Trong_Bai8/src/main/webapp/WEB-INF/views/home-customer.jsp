<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
/* Reset some default styles */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

/* Apply a background color and basic font styling */
body {
    background-color: #f0f0f0;
    font-family: Arial, sans-serif;
}

/* Style the wrapper and header */
#wrapper {
    background-color: #333;
    color: #fff;
    text-align: center;
    padding: 20px;
}

#header h2 {
    font-size: 24px;
}

/* Style the container and content */
#container {
    background-color: #fff;
    border: 1px solid #ccc;
    margin: 20px;
    padding: 10px;
}

#content {
    margin: 20px;
}

/* Style the "Add Customer" button */
.add-button {
    background-color: #007bff;
    color: #fff;
    border: none;
    padding: 10px 20px;
    cursor: pointer;
}

.add-button:hover {
    background-color: #0056b3;
}

/* Style the table */
table {
    width: 100%;
    border-collapse: collapse;
}

table th, table td {
    border: 1px solid #ccc;
    padding: 10px;
    text-align: left;
}

/* Style the "Update" and "Delete" links */
a {
    text-decoration: none;
    margin-right: 10px;
}

/* Apply some hover effect to the links */
a:hover {
    color: #007bff;
}

/* Style the confirmation dialog for delete */
.confirmation-dialog {
    background-color: #fff;
    border: 1px solid #ccc;
    padding: 10px;
}

</style>
</head>
<body>

	<div id=wrapper>
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
			
			<c:url var="addCustomer" value="/customer/showFormForAdd"></c:url>
			<a href="${addCustomer }">Add customer</a>

			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach var="tempCustomer" items="${customers }">
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempCustomer.id }"></c:param>
					</c:url>
					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerId" value="${tempCustomer.id }"></c:param>
					</c:url>

					<tr>
						<td>${tempCustomer.firstName }</td>
						<td>${tempCustomer.lastName }</td>
						<td>${tempCustomer.email }</td>
						<td><a href="${updateLink }">Update</a> <a
							href="${deleteLink }"
							onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>
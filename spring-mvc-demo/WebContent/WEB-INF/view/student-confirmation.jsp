<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>

<!-- get methods are called for firstName, lastName etc. -->
The student is confirmed: ${student.firstName} ${student.lastName} 

<br><br>

Country: ${student.country}

<br><br>

<a href="/spring-mvc-demo">Return to Main Page</a>
</body>
</html>
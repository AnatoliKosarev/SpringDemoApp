<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">

<title>Hello World - Hello Page</title>

</head>

<body>

Hello World of Spring!

<br><br>
<!-- reading form field data with the use of jsp expression language using the name of the input field "studentName" -->
Student name: ${param.studentName}

<br><br>

<!-- pass the message from the model where we put the message via controller method "letsShoutDude()" -->
The message: ${message}

</body>

</html>
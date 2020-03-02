<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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

Country: ${student.countryValue}

<br><br>

Favorite programming language: ${student.favoriteLanguage}

<br><br>

Used following operating systems:


<!-- using forEach loop to display operatingSystems array elements with the help of jstl (necessary to add reference JSTL tag library at the top of the page) -->
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">

	<li>${temp}</li>
	
	</c:forEach>

</ul>

<br><br>

<a href="/spring-mvc-demo">Return to Main Page</a>
</body>
</html>
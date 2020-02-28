<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>

	<!-- action - where it navigates after submit; set methods are called for firstName, lastName, etc. -->
	<form:form action="processForm" modelAttribute="student">
		
		First name: <form:input path="firstName" />
		
		<br><br>
		
		Last name: <form:input path="lastName" />
		
		<br><br>
		
		Country:
		
		<!-- when form is loaded, Spring will call student.getCountryList and will populate dropdown list -->
		<form:select path="country">
		
			<form:options items="${student.countryList}" />
			
		</form:select>
		
		<!-- Hardcoded values for dropdown list
		<form:select path="country">
		
			<form:option value="Brazil" label="Brazil" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
			<form:option value="Belarus" label="Belarus" />
			
		</form:select>
		-->
		
		<br><br>
		
		<form:radiobuttons path="favoriteLanguage" items="${student.languageList}" />
		
		<!-- Hardcoded values for dropdown list
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		Javascript <form:radiobutton path="favoriteLanguage" value="Javascript" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		Python <form:radiobutton path="favoriteLanguage" value="Python" />
		-->
		
		<br><br>
		
		<input type="submit" value="Submit" />
		
	</form:form>
	

</body>
</html>
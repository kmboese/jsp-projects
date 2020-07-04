<%@ page import="com.kevbot.jsp.StudentDropdownFormController" %>

<html>

<head>
<title>Student Verification Page</title>
</head>
<body>

<%
	if (StudentDropdownFormController.isValid(request)) {
		out.println(StudentDropdownFormController.getWelcome(request));

		// Display country-specific information
		out.println(StudentDropdownFormController.getCountryMessage(request));

		// Display user's favorite programming language
		out.println(StudentDropdownFormController.getProgrammingMessage(request));

	} 
	else {
		out.println(StudentDropdownFormController.getErrorPage(request));
	}
%>

</body>

</html>
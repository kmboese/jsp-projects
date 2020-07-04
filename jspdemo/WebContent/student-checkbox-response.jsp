<%@ page import="com.kevbot.jsp.StudentCheckboxFormController"%>

<html>

<head>
<title>Student Verification Page</title>
</head>
<body>

<%
	if (StudentCheckboxFormController.isValid(request)) {
		out.println(StudentCheckboxFormController.getWelcome(request));

		// Display country-specific information
		out.println(StudentCheckboxFormController.getCountryMessage(request));

		// List extracurricular activities
		out.println(StudentCheckboxFormController.getECActivities(request));

	} 
	else {
		out.println(StudentCheckboxFormController.getErrorPage(request));
	}
%>

</body>

</html>
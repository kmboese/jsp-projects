<%-- <%@ page import="<source_package" %> --%>
<%-- <%@ page import="<java_imports>" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
	// Set up some data to use on the page
	int[] data = { 1, 2, 3 };
	pageContext.setAttribute("pageData", data);
%>

<head>
<link href="styling/base-styling.css" rel="stylesheet">
</head>

<html>

<body>

	<ul>
		<c:forEach val="x" items="${pageData}">
			<li>x</li>
		</c:forEach>

	</ul>

</body>

</html>
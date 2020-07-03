<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
	// Create some sample data
	String[] cities = {"Mumbai", "Singapore", "Dublin"};
	
	pageContext.setAttribute("myCities", cities);
%>

<html>

<body>
	<h3>Cities</h3>
	<c:forEach var="city" items="${myCities}">
		${city} </br>
	</c:forEach>

</body>

</html>
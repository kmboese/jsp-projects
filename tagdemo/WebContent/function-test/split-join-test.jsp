<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<head>


</head>


<html>

<body>

	<c:set var="cities" value="Dublin,Pleasanton,Livermore,San Ramon"/>
	<h3>Split Test</h3>
	<br/>
	<c:set var="citiesArray" value="${fn:split(cities, ',')}"/>
	
	<h4>Cities</h4>
	<p>Original string: "${cities}"</p>
	
	<p>Using split():</p>
	<c:forEach var="city" items="${citiesArray}">
		${city} <br/>
	</c:forEach>
	
	<p> Test: using split() without an intermediate variable</p>
	<c:forEach var="city" items="${fn:split(cities, ',')}">
		${city} <br/>
	</c:forEach>
	
	<h3> Join Test </h3>
	<c:set var="citiesString" value="${fn:join(citiesArray, '+')}"/>
	<p>Joined cities array: ${citiesString}</p>
	

</body>

</html>
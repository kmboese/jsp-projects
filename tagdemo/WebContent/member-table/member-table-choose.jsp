<%@ page import="com.kevbot.tagdemo.Member" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<% 
	// Set up data here
	ArrayList<Member> members = Member.getDefaultMembers();
	pageContext.setAttribute("members", members);
%>

<head>
	<link href="styling/base-styling.css" rel="stylesheet">
</head>

<html>

<body>

<h1>Members - Choose</h1>
<table style="width:100%">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Gold Member</th>
	</tr>
	<c:forEach var="member" items="${members}">
		<tr>
			<td>${member.firstName}
			<td>${member.lastName}
			<c:choose>
				<c:when test="${member.goldMember}">
					<td>Yes
				</c:when>
				
				<c:otherwise>
					<td>No
				</c:otherwise>
			</c:choose>
		</tr>
	</c:forEach>
</table>

<h3>Members with Discounts</h3>
<ul>
	<c:forEach var="member" items="${members}">
		<c:if test="${member.goldMember}">
			<li>${member.firstName}: ${member.discountRatePercentage}%
		</c:if>
	</c:forEach>
</ul>


</body>

</html>
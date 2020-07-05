<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:set var="theLocale" 
	   value="${ not empty param.theLocale ? param.theLocale : pageContext.request.locale }"
	   scope="session"
/>

<fmt:setLocale value="${theLocale}" />
<fmt:setBundle basename="com.kevbot.tagdemo.i18n.resources.mylabels"/>

<html>

<head>
	<link href="styling/base-styling.css" rel="stylesheet">
</head>

<body>
	<p>
		Choose your language: <a href="i18n-page.jsp?theLocale=en_US">English (US)</a> | <a href="i18n-page.jsp?theLocale=es_ES">Spanish (ES)</a> | <a href="i18n-page.jsp?theLocale=de_DE">German (DE)</a>
	</p> 
<hr>

<h3>
	<fmt:message key="label.greeting" />
</h3>
<fmt:message key="label.firstname" /> : Kevin <br/> <br/>
<fmt:message key="label.lastname" /> : Boese <br/> <br/>
<fmt:message key="label.welcome" /> <br/> <br/>

</body>

</html>
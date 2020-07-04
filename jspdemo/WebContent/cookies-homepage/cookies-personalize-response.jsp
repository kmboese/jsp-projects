<%@ page import="com.kevbot.CookieDemo.CookiesAppController"%>

<html>

<head>
	<title>Choose Your Starter</title>
	<meta name="description" content="Choose your favorite Gen 1 Pokemon starter">
    <meta name="keywords" content="Pokemon starter Nintendo games rpg">
    <link href="styling/base-styling.css" rel="stylesheet">
</head>

<body>

<h4>Thanks! We'll remember your favorite starter Pokemon.</h4>


<%
	// Read form data
	String favoriteStarter = request.getParameter("favoriteStarter");

	// Save starter data in cookie
	Cookie cookie = new Cookie("cookieApp.favoriteStarter", favoriteStarter);
	
	// Set the cookie lifespan
	CookiesAppController.setCookieExpiration(cookie, 30);
	
	// Send cookie to browser
	response.addCookie(cookie);
%>

<a href="cookies-homepage.jsp">Great, take me back to the homepage!</a>

</body>

</html>
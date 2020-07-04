<%@ page import="com.kevbot.CookieDemo.CookiesAppController"%>

<html>

<head>
	<title>Your Favorite Starter</title>
	<meta name="description" content="Choose your favorite Gen 1 Pokemon starter">
    <meta name="keywords" content="Pokemon starter Nintendo games rpg">
    <link href="styling/base-styling.css" rel="stylesheet">
</head>

<body>

<h1>Pokemon Portal</h1>
<%
	// Get cookie data
	Cookie[] cookies = request.getCookies();
	
	// Get header HTML
	out.println(CookiesAppController.getHeaderHTML(cookies));
	
	// Get Pokemon info
	out.println(CookiesAppController.getPokemonInfoHTML(cookies));
%>

<br><br>
<hr>
<a href="cookies-personalize-form.html">Personalize this page</a>

</body>

</html>
<html>

<body>

<h3>You can run loops inside of JSP pages using script tags!</h3>

<%
for (int i = 0; i < 5; i++) {
	out.println("<br/>Loop " + i);
	if (i%2 == 0) {
		out.println("<br/>This loop is even!");
	}
	out.println("<br/>");
}

%>

</body>

</html>
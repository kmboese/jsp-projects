<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<head>


</head>


<html>

<body>

	<c:set var="data" value="Uphold Section 230"/>
	Sample string: <b>${data}</b>
	<br/><br/>
	Length: ${fn:length(data)}
	<br/>
	Uppercase: ${fn:toUpperCase(data)}
	<br/>
	Does the string start with<b>"Up"</b>? ${fn:startsWith(data, "Up")}

</body>

</html>
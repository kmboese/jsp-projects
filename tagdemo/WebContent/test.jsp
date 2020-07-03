<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<body>

<c:set var="currentDate" value="<%= new java.util.Date()  %>" />
Time on the server is ${currentDate}
</body>

</html>
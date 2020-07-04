<%@ page import="com.kevbot.jsp.TodoListController"%>

<html>

<head>
<title>To-Do List App</title>
</head>


<body>

	<h3>Add new item:</h3>
	<form action="todo-list.jsp">
		<input type="text" name="itemEntry"> 
		<input type="submit" value="Submit" name="Submit">
	</form>
	<hr>
	<br>
	
<%

	// Load the list if the user is logging in for the first time
	if (TodoListController.isNewSession(request)) {
		TodoListController.loadTodoList(request);
	}

	// Load the list if the Load button was pressed
	if (TodoListController.loadButtonPressed(request)) {
		TodoListController.loadTodoList(request);
		response.sendRedirect("todo-list.jsp");
	}

	// Save the list if the save button was pressed
	if (TodoListController.saveButtonPressed(request)) {
		TodoListController.writeTodoList(request);
		response.sendRedirect("todo-list.jsp");
	}

	// Clear the Todo list if the Clear button was pressed
	if (TodoListController.clearButtonPressed(request)) {
		TodoListController.clearList(request);
	}

	// Add new todo list item if it exists, and reload the page
	if (TodoListController.addListItem(request)) {
		response.sendRedirect("todo-list.jsp");
	}
	
	// Display todo list
	out.println(TodoListController.getListItemsHTML(request));
	
	// Display buttons
	out.println(TodoListController.getButtonsHTML(request));
	
	// Add the footer
	out.println(TodoListController.getFooter(request));
%>

</body>

</html>
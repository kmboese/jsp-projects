package com.kevbot.jsp;

import java.util.*;
import javax.servlet.http.*;


public class TodoListController {
	static String dataDirectory = "C:\\Users\\Kevin B\\eclipse-workspace\\jspdemo\\data\\";
	
	public static boolean isActive() {
		return true;
	}
	
	public static boolean isNewSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String newSession = (String) session.getAttribute("newSession");
		
		if (newSession == null) {
			System.out.println("New session started: " + session.getId());
			session.setAttribute("newSession", "false");
			return true;
		}
		else {
			return false;
		}
	}
	
	public static ArrayList<String> getItems(HttpServletRequest request) {
		return (ArrayList<String>) request.getSession().getAttribute("userTodoList");
	}
	
	public static boolean hasItems(HttpServletRequest request) {
		HttpSession session = request.getSession();
		List<String> userTodoList = (ArrayList<String>) session.getAttribute("userTodoList");
		if (userTodoList == null) {
			return false;
		}
		else {
			return !userTodoList.isEmpty();
		}
		  
	}
	
	// Returns true if an item was added, or false otherwise
	public static boolean addListItem(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String item = request.getParameter("itemEntry");
		List<String> userTodoList = (ArrayList<String>) session.getAttribute("userTodoList");
		
		// Instantiate the user todo list if it doesn't exist
		if (userTodoList == null) {
			userTodoList = new ArrayList<String>();
			session.setAttribute("userTodoList", userTodoList);
		}
		
		// Add item if found in request
		if (item != null && !item.isBlank()) {
			userTodoList.add(item);
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public static String getListItemsHTML(HttpServletRequest request) {
		String ret = "";
		HttpSession session = request.getSession();
		
		// Retrieve the user todo list from the session
		List<String> userTodoList = (ArrayList<String>) session.getAttribute("userTodoList");
		
		ret += "<h3> To Do List: </h3>";
		
		// Print the todo list if not empty
		if (userTodoList != null && !userTodoList.isEmpty()) {
			ret += "<ol type=\"1\">";
			for (String listItem : userTodoList) {
				ret += "<li>" + listItem + "</li>";
			}
			ret += "</ol>";
		}
		
		
		else { 
			ret += "<p>Looks like your to do list is empty! Try adding items using the \"Add new item\" ";
			ret += "box above.</p>";
		}
		
		return ret;
		
	}
	
	public static boolean clearButtonPressed(HttpServletRequest request) {
		return (request.getParameter("clear") != null);
	}
	
	public static boolean saveButtonPressed(HttpServletRequest request) {
		return (request.getParameter("save") != null);
	}
	
	public static boolean loadButtonPressed(HttpServletRequest request) {
		return (request.getParameter("load") != null);
	}
	
	public static String getButtonsHTML(HttpServletRequest request) {
		String ret = "";
		
		ret += "<form action=\"todo-list.jsp\">";
		
		// Add Save button
		ret += "<input type=\"submit\" value=\"Save\" name=\"save\">";
		
		// Add Load button
		ret += "<input type=\"submit\" value=\"Load\" name=\"load\">";
		
		// Add Clear button if list is not empty
		if (hasItems(request)) {
			ret += "<input type=\"submit\" value=\"Clear\" name=\"clear\">";
		}
		
		ret += "</form>";
		
		return ret;
	}
	
	public static String getClearButtonHTML() {
		String ret = "";
		
		ret += "<form action=\"todo-list.jsp\">";
		ret += "<input type=\"submit\" value=\"Clear\" name=\"clear\">";
		ret += "</form>";
		
		return ret;
	}
	
	public static String getSaveButtonHTML() {
		String ret = "<br>";
		
		ret += "<form action=\"todo-list.jsp\">";
		ret += "<input type=\"submit\" value=\"Save\" name=\"save\">";
		ret += "</form>";
		
		return ret;
	}
	
	public static void clearList(HttpServletRequest request) {
		HttpSession session = request.getSession();
		ArrayList<String> userTodoList = (ArrayList<String>) session.getAttribute("userTodoList");
		if (userTodoList != null) {
			userTodoList.clear();
		}
	}
	
	public static String getFooter(HttpServletRequest request) {
		String sessionId = request.getSession().getId();
		String ret = "<footer>";
		
		ret += "<p>Session ID: " + sessionId + "</p>";
		
		ret += "</footer>";
		return ret;
	}
	
	public static void loadTodoList(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String sessionId = session.getId();
		String path = dataDirectory + sessionId + "_list.txt";
		
		// Read list from file, if it exists
		List<String> userTodoList = FileUtils.loadListFromFile(path);
		
		// Save the list to the session
		session.setAttribute("userTodoList", userTodoList);
	}
	
	public static void writeTodoList(HttpServletRequest request) {
		List<String> userTodoList = getItems(request);
		String sessionId = request.getSession().getId();
		
		if (userTodoList != null && !userTodoList.isEmpty()) {
			
			String path = dataDirectory + sessionId + "_list.txt";
			System.out.println("Writing todo list to file: " + path);
			FileUtils.writeListToFile(userTodoList, path);
		}
	}

}

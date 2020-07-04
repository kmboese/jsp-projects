package com.kevbot.jsp;
import javax.servlet.http.*;

public class StudentDropdownFormController {
	static String backPage = "\"student-dropdown-form.html\"";
	
	public static String getWelcome(HttpServletRequest request) {
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		String ret = "";
		
		ret += "<h3>";
		ret += "Welcome, " + firstname + " " + lastname + "!";
		ret += "</h3>";
		
		return ret;
	}
	
	public static String getCountryMessage(HttpServletRequest request) {
		String ret = "";
		String firstname = request.getParameter("firstName");
		String country = request.getParameter("country");
		
		if ("US".equals(country)) {
			ret += ("Howdy, pardner!");
		}
		else if ("Spain".equals(country)) {
			ret += ("Hola, ¿como estas?");
		}
		else if ("France".equals(country)) {
			ret += ("Bienvenue dans le futur!");
		}
		else if ("Germany".equals(country)) {
			ret += ("Guten tag, " + firstname);
		}
		
		return ret;
	}
	
	public static String getProgrammingMessage(HttpServletRequest request) {
		String ret = "";
		String favoriteLanguage = request.getParameter("favoriteLanguage");
		
		if (favoriteLanguage != null) {
			ret += ("<br/><br/>");
			ret += ("Your favorite language is <b>" + favoriteLanguage + "</b> .");
		}
		
		return ret;
	}
	
	public static String getErrorPage(HttpServletRequest request) {
		String ret = "";
		
		ret += "First and last name are required but were not entered. Please go back and re-submit your information.";
		ret += "<br/><br/>";
		ret += "<a href=" + StudentDropdownFormController.backPage + ">Back</a>";
		
		return ret;
	}
	
	public static boolean isValid(HttpServletRequest request) {
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		
		return (!firstname.isEmpty() && !lastname.isEmpty());
	}

}

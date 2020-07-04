package com.kevbot.jsp;
import javax.servlet.http.*;

public class StudentCheckboxFormController {
	static String backPage = "\"student-checkbox-form.html\"";
	
	public static String getWelcome(HttpServletRequest request) {
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		String ret = "";
		
		ret += "<h3>";
		ret += "Welcome, " + firstname + " " + lastname + "!";
		ret += "</h3>";
		
		return ret;
	}
	
	public static String getErrorPage(HttpServletRequest request) {
		String ret = "";
		
		ret += "First and last name are required but were not entered. Please go back and re-submit your information.";
		ret += "<br/><br/>";
		ret += "<a href=" + StudentCheckboxFormController.backPage + ">Back</a>";
		
		return ret;
	}
	
	public static String getCountryMessage(HttpServletRequest request) {
		String welcomeString = "";
		String firstname = request.getParameter("firstName");
		String country = request.getParameter("country");
		
		if ("US".equals(country)) {
			welcomeString += ("Howdy, pardner!");
		}
		else if ("Spain".equals(country)) {
			welcomeString += ("Hola, ¿como estas?");
		}
		else if ("France".equals(country)) {
			welcomeString += ("Bienvenue dans le futur!");
		}
		else if ("Germany".equals(country)) {
			welcomeString += ("Guten tag, " + firstname);
		}
		
		return "<h3>" + welcomeString + "</h3>";
	}
	
	public static String getECActivities(HttpServletRequest request) {
		String[] ecActivities = request.getParameterValues("ecActivities");
		
		// If no activities selected, don't show EC section
		if (ecActivities == null) {
			return "";
		}
		
		String ret = "<br/>";
		ret += "<h4>Chosen Extracurricular Activities</h4>";
		ret += "<ul>";
		
		// Loop through all checked responses
		for (String activity : ecActivities ) {
			ret += "<li>" + activity + "</li>";
		}
		
		ret += "</ul>";
		
		return ret;
	}
	
	public static boolean isValid(HttpServletRequest request) {
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		
		return (!firstname.isEmpty() && !lastname.isEmpty());
	}
	

}

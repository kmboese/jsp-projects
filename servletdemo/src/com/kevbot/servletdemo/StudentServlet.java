package com.kevbot.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
/* The HTTP path here has to match the directory structure of the HTML page that is
 * sending the request. Since "student-form.html" is in the "student-form" directory, 
 * the path needs to be "/student-form/StudentServlet" for the route from the HTML request
 * to be correct.
 */
@WebServlet("/student-form/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// set the content type
		response.setContentType("text/html");
		
		// get the printwriter
		PrintWriter out = response.getWriter();
		
		// Write the student information
		String firstName = (String) request.getParameter("firstName");
		String lastName = (String) request.getParameter("lastName");
		StringBuilder pageHTML = new StringBuilder();
		pageHTML.append("<html> ");
		pageHTML.append("<head> </head>");
		pageHTML.append("<body>");
		pageHTML.append("<h3> Welcome, " + firstName + " " + lastName + "!</h3>");
		pageHTML.append("</body>");
		pageHTML.append("</html>");
		
		out.println(pageHTML);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

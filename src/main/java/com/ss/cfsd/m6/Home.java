package com.ss.cfsd.m6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public Home() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if("".equals(username) || username == null || "".equals(password) || password == null) {
			response.sendRedirect("http://localhost:8080/Module-6-Servlet/Login");
		} else if(!"secret".equals(password)){
			out.println("<p>You did not enter the 'secret' password.</p>");
		} else if("secret".equals(password)) {
			out.println("<p>Welcome, " + username + "!</p>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

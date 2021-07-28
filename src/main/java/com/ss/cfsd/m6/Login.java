package com.ss.cfsd.m6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<form action=\"\\Module-6-Servlet\\Home\">"
				+ "Username:<input type=\"text\" name=\"username\"></input>"
				+ "<br>"
				+ "<br>"
				+ "Password:<input type=\"password\" name=\"password\"></input>"
				+ "<br>"
				+ "<br>"
				+ "<button type=\"submit\">Login</button>"
				+ "</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package com.exercise31session.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8'");
		PrintWriter output=response.getWriter();
		
		String username= request.getParameter("txtUserName");
		String password= request.getParameter("txtPassword");
		
		output.println("Username: "+ username);
		output.println("Password: "+ password);
		
		
		if(username.equals("admin") &&password.equals("admin")) 
		{
		HttpSession misesion=request.getSession();
		misesion.setAttribute("user", username);
		misesion.setAttribute("pass", password);
		response.sendRedirect("welcome.jsp");
		}
		else
		{
			output.println("usuario y contraseña incorrectos");
			
		}
		output.close();
	}

}

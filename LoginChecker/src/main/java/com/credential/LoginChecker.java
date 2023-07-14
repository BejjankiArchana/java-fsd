package com.credential;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginChecker")
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public LoginChecker() {
        // TODO Auto-generated constructor stub
    	super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uname=request.getParameter("txtuname");
		String pword=request.getParameter("txtpword");
		PrintWriter out=response.getWriter();
		if(uname.equalsIgnoreCase("java")&&pword.equals("eclipse@123"))
			out.println("welcome user::"+uname);
		else
			out.println("invalid user");
		
	}

}

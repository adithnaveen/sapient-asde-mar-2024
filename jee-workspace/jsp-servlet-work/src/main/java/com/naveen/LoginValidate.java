package com.naveen;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naveen.logic.LoginValidateLogic;

public class LoginValidate extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
		
		String uName = req.getParameter("uname");
		String password = req.getParameter("pwd");
		
		
		if(new LoginValidateLogic().loginUser(uName, password)) {
			req.setAttribute("MYATTRIBUTE", "SOME VALUE GOES HERE OR OBJECT"); 
			req.setAttribute("MYLIST", 
					Arrays.asList("One", "Two", "Three")); 
			
			req.getRequestDispatcher("/HomeController").forward(req, resp);
			
			
		}else {
			resp.setContentType("text/html" ); 
			resp.getWriter().print("<h3>Sorry invalid Credentails  </h3>") ; 
			
			req.getRequestDispatcher("/login-form.html").include(req, resp); 
			
		}
		
		
		
		
	}

	
	
	
}

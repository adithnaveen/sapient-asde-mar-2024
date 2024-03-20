package com.naveen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naveen.logic.LoginService;

@WebServlet("/get-employees")
public class GetEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginService service = new LoginService();
		// assume the list is given 
		 
		request.setAttribute("EMPS", service.getEmployees());
		String view ="/WEB-INF/pages/ShowEmps.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}

}

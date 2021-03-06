import java.io.IOException;
//package com.saraya;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.UsrValidation;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	UsrValidation id = new UsrValidation();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
			request.setAttribute("name", request.getParameter("name"));
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String prenom = request.getParameter("first");
		request.setAttribute("first",prenom);
		String nam = request.getParameter("name");
		boolean valid = id.IsValid(nam, nam);
		if(valid) {
		
		request.setAttribute("name",nam);
		String password = request.getParameter("pass");
		request.setAttribute("pass",password);
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
		
		
		} else {
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
				


}


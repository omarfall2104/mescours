package com.saraya.login;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saraya.model.Formation;
import com.saraya.service.FormationService;

@WebServlet(urlPatterns = "/formation.do")
public class FormationServlet extends HttpServlet {
	FormationService fm = new FormationService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String nom = request.getParameter("nom");
		request.setAttribute("name", request.getParameter("nom"));
		request.setAttribute("training", fm.getAllFormation());
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		FormationService fm = new FormationService();
		String training = request.getParameter("add");
		fm.addFormation(new Formation(training));
		response.sendRedirect("formation.do");
	
		

		
	}
	}





import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	//@Override
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setAttribute("name", request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		FormationCre mesFormation = new FormationCre();
		mesFormation.getAllFormation();
		UserValidation validate = new UserValidation();
		String name = getSession().request.getParameter("user");
		//request.setAttribute("user", name);
		String mypass = request.getParameter("pass");
		
		
		if(validate.userValidation(name, mypass)) {
		/*	request.setAttribute("formats", mesFormation.getAllFormation());
		request.setAttribute("formats", name);
		//request.setAttribute("user", name);
		request.setAttribute("user", name);
		request.setAttribute("pass", mypass);
		request.getRequestDispatcher("/WEB-INF/views/page2.jsp").forward(request, response);*/
	response.sendRedirect("formation.do");
		} else {
		request.setAttribute("errorMessage", "User name or password provided incorrect");
	request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

		
	}
}
}

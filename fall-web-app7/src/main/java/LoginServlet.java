import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("name", request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String monprenom = request.getParameter("name");
		request.setAttribute("name", monprenom );
		
		String monnom = request.getParameter("nom");
		request.setAttribute("nom", monnom );
		
		String monpass = request.getParameter("pass");
		request.setAttribute("pass", monpass );
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}

}

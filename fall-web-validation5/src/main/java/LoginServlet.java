import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= "/login.do")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("name", request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		UserValidation uv = new UserValidation();
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		if(uv.userValidation(name, pass)) {
			request.setAttribute("name", name);
			request.setAttribute("pass", name);
			
			request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
		}
		else {
			request.setAttribute("MessageError", "Your password or your username is no valide");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}

}

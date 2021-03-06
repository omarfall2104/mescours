import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("name", request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException {
		ValidationClass valide = new ValidationClass();
			String prenom = request.getParameter("cre");
			String nom = request.getParameter("name");
			String pword = request.getParameter("pass");
			
			//String nom = request.getParameter("name");
			if(valide.userValidation(nom, pword)) {
			request.setAttribute("name", nom);
			request.setAttribute("cre", prenom);
			//String pword = request.getParameter("pass");
			request.setAttribute("pass", pword);
			
			request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
		}
			else {
				request.setAttribute("errorMessage", "User name or password povided incorrect");
				request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

			}

}
}

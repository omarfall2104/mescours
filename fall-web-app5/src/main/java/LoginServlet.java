import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
	UsrValidation id = new UsrValidation();
	FormationService fs = new FormationService();
		//fs.getAllFormation();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException {
		request.setAttribute("name", request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String prenom = request.getParameter("first");
		String nom = request.getParameter("nam");
		String mpass = request.getParameter("pass");
		boolean valid = id.IsValid(nom, mpass);
		if (valid) {
				request.setAttribute("first", prenom);
				request.setAttribute("nam", nom);
				
				request.setAttribute("pass", mpass);
				
				
				request.setAttribute("formats", fs.getAllFormation());
				request.setAttribute("format", nom);
				request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
		}else {
			request.setAttribute("errorMessage", "Sorry wrong credential");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			
		}
			}
	//request.setAttribute("format", nom);
	// en haut Formation fs = new FormationService();
	// fs.getAllFormation();
}

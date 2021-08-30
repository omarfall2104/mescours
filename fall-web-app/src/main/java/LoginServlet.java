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
		//String fall = request.getParameter("nam");
		//request.setAttribute("nam", fall);
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	//public class LoginServlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException {
			String fall = request.getParameter("nam");
			request.setAttribute("nam", fall);
			String first = request.getParameter("pass");
			request.setAttribute("pass", first);
			request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
		}

}


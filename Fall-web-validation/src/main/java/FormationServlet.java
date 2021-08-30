
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/formation.do")
public class FormationServlet extends HttpServlet {
	//@Override
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		FormationCre mesFormation = new FormationCre();

		request.setAttribute("formats", mesFormation.getAllFormation());

		request.setAttribute("name", request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/page2.jsp").forward(request, response);
	}
	
	

	
}
}

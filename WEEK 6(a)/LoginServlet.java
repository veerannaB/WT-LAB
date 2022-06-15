import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n=request.getParameter("t1");
		String pwd=request.getParameter("t2");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		if(n.equals("veeranna")&& pwd.equals("aiml1234")) {
			response.sendRedirect("success.jsp");
		}
		else {
			out.println("<font-color=red size=14>Sorry! Username or Password incorrect !!!</font>");
			RequestDispatcher rd=request.getRequestDispatcher("input.jsp");
			rd.include(request, response);
		}
		
	}

}

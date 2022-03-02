

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class index
 */
public class index extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
	    HttpSession session= request.getSession();
		if("admin".equalsIgnoreCase(userName)&& "Admin@123".equals(password)) {
			rd=getServletContext().getRequestDispatcher("/Welcomepage.html");
			System.out.println("valid user");
			rd.forward(request, response);
		}else {
			rd=getServletContext().getRequestDispatcher("/error.html");
			System.out.println("invalid user");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

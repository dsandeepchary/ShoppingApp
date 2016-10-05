package shop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Invalidate
 */
public class Invalidate extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.invalidate();
		PrintWriter out=response.getWriter();
		out.println("<html><center>");
		out.println("<font color='black'><h1>Logged out</h1></font><br>");
		out.println("<h2>Thank you for Shopping with us</h2><br>");
		out.println("<h3><a href='index.html'>Shop Again</a></h3>");
		out.println("</center></html>");
		}

}

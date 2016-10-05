package shop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Bill
 */
public class Bill extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		response.setContentType("text/html");
		long bags=(Integer)session.getAttribute("bags");
		long clothes=(Integer)session.getAttribute("clothes");
		long laptops=(Integer)session.getAttribute("laptops");
		long mobiles=(Integer)session.getAttribute("mobiles");
		long shoes=(Integer)session.getAttribute("shoes");
		long total=shoes+laptops+clothes+bags+mobiles;
		out.println("<html>");
		out.println("<form action='invalidate'>");
		out.println("<div align='right'><input type='submit' value='Logout'></div>");
		out.println("</form>");
		out.println("</center>");
		out.println("<font color='blue'><h1>Your Total Bill</h1></font>");
		out.println("<table bgcolor='orange' border='2'>");
		out.println("<tr><td>Shoes Bill:</td>");
		out.println("<td>"+shoes+"</td></tr>");
		out.println("<tr><td>Clothes Bill:</td>");
		out.println("<td>"+clothes+"</td></tr>");
		out.println("<tr><td>Mobiles Bill:</td>");
		out.println("<td>"+mobiles+"</td></tr>");
		out.println("<tr><td>Backpacks Bill:</td>");
		out.println("<td>"+bags+"</td></tr>");
		out.println("<tr><td>Laptops Bill:</td>");
		out.println("<td>"+laptops+"</td></tr>");
		out.println("<tr colspan='2'>");
		out.println("<td>Total Bill: "+total+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<h3><a href='index.html'>Shop More</a></h3>");
		out.println("</center></html>");
		}
}

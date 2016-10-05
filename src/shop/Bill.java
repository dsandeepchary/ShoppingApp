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
		Object bag=session.getAttribute("bags");
		Long o1=(Long)bag;
		Object clothe=session.getAttribute("clothes");
		Long o2=(Long)clothe;
		Object laptop=session.getAttribute("laptops");
		Long o3=(Long)laptop;
		Object mobile=session.getAttribute("mobiles");
		Long o4=(Long)mobile;
		Object shoe=session.getAttribute("shoes");
		Long o5=(Long)shoe;
		Long total=(Long)(o1+o2+o3+o4+o5);
		out.println("<html>");
		out.println("<form action='invalidate'>");
		out.println("<div align='right'><input type='submit' value='Logout'></div>");
		out.println("</form>");
		out.println("</center>");
		out.println("<font color='blue'><h1>Your Total Bill</h1></font>");
		out.println("<table bgcolor='orange' border='0'>");
		out.println("<tr><td>Shoes Bill:</td>");
		out.println("<td>"+shoe+"</td></tr>");
		out.println("<tr><td>Clothes Bill:</td>");
		out.println("<td>"+clothe+"</td></tr>");
		out.println("<tr><td>Mobiles Bill:</td>");
		out.println("<td>"+mobile+"</td></tr>");
		out.println("<tr><td>Backpacks Bill:</td>");
		out.println("<td>"+bag+"</td></tr>");
		out.println("<tr><td>Laptops Bill:</td>");
		out.println("<td>"+laptop+"</td></tr>");
		out.println("<tr colspan='2'>");
		out.println("<td>Total Bill:"+total+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<h3><a href='index.html'>Shop More</a></h3>");
		out.println("</center></html>");
		}
}

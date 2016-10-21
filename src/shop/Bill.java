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
		Object bag=session.getAttribute("bags");
		long o1;
		if(bag==null)
		{
			o1=0;
		}
		else 
			o1=(Long)bag;
		Object clothe=session.getAttribute("clothes");
		long o2;
		if(clothe==null)
		{
			o2=0;
		}
		else 
			o2=(Long)clothe;
		Object laptop=session.getAttribute("laptops");
		long o3;
		if(laptop==null)
		{
			o3=0;
		}
		else 
			o3=(Long)laptop;
		Object mobile=session.getAttribute("mobiles");
		long o4;
		if(mobile==null)
		{
			o4=0;
		}
		else 
			o4=(Long)mobile;
		Object shoe=session.getAttribute("shoes");
		long o5;
		if(shoe==null)
		{
			o5=0;
		}
		else 
			o5=(Long)shoe;
		long total=o1+o2+o3+o4+o5;
		out.println("<html>");
		out.println("<center>");
		out.println("<form action='invalidate'>");
		out.println("<div align='right'><input type='submit' value='Logout'></div>");
		out.println("</form>");
		out.println("<font color='blue'><h1>Your Total Bill</h1></font>");
		out.println("<table bgcolor='orange' border='0'>");
		out.println("<tr><td>Shoes Bill  :</td>");
		out.println("<td>"+o5+"</td></tr>");
		out.println("<tr><td>Clothes Bill:</td>");
		out.println("<td>"+o2+"</td></tr>");
		out.println("<tr><td>Mobiles Bill:</td>");
		out.println("<td>"+o4+"</td></tr>");
		out.println("<tr><td>Bags Bill   :</td>");
		out.println("<td>"+o1+"</td></tr>");
		out.println("<tr><td>Laptops Bill:</td>");
		out.println("<td>"+o3+"</td></tr>");
		out.println("<tr>");
		out.println("<td>Total Bill      :</td>");
		out.println("<td>"+total+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<h3><a href='welcome.html'>Shop More</a></h3>");
		out.println("<form action='dummypay'>");
		out.println("<div align='right'><input type='submit' value='Pay for the Bill'></div>");
		out.println("</form>");	
		out.println("</center></html>");
		}
}

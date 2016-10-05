package shop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Shoes extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String[] select = request.getParameterValues("shoes");
		out.println("<html><body>");
		out.println("<form action='invalidate'>");
		out.println("<div align='right'><input type='submit' value='Logout'></div>");
		out.println("</form>");
		out.println("<form action='bill'>");
		out.println("<div align='right'><input type='submit' value='Bill'></div>");
		out.println("</form>");
		out.println("<h1>Bill for Selected Shoes</h1>");
		out.println("<ul>");
		HttpSession session=request.getSession();
		long sum=0;
		for(String s:select)
		{
			
			int f=Integer.parseInt(s);
			out.println("<li>"+s+"</li>");
			sum=sum+f;
		}
		session.setAttribute("shoes",sum);
		out.println("</ul>");
		out.println("<hr>");
		out.println("Total= "+sum);
		out.println("<hr>");
		out.println("<br>");
		out.println("Shop in Other Categories:&emsp;<a href='backpack.html'>Backpacks</a>&emsp;<a href='clothing.html'>Clothing</a>&emsp;<a href='laptop.html'>Laptops</a>&emsp;<a href='clothing.html'>Clothing</a>");
		out.println("</body></html>");
		
	}

}

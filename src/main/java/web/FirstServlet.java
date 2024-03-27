package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name="cs",urlPatterns= {"/fs"})
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, 
			             HttpServletResponse response) throws ServletException, IOException {
	
	/*	String nom = request.getParameter("nom");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>"+nom+"</h1>");
		out.println("</body>");
		*/
		
		request.getRequestDispatcher("vue.jsp").forward(request, response);
		
	}
	
	
	

}

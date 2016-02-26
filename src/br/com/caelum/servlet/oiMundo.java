package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class oiMundo extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(request, response);
		PrintWriter saida = response.getWriter();
		saida.println("<html>");
		saida.println("<head>");
		saida.println("<title>Primeira Servlet!</title>");
		saida.println("</head>");
		saida.println("<body>");
		saida.println("<h1>Oi mundo Servlet</h1>");
		saida.println("</body>");
		saida.println("</html>");
	}
}

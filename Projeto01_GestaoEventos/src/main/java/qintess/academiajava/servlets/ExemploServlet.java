package qintess.academiajava.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Exemplo Servlet", urlPatterns = { "/exemplo" })
public class ExemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExemploServlet() {
		
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Date data = new Date();
		double numero = Math.random();
		
		request.setAttribute("vdata", data);
		request.setAttribute("vnumero", numero);
		
		//tranferindo a requisi�ao para resultado.jsp
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
		
//		PrintWriter out = response.getWriter();	
//       
//       String meunome = request.getParameter("nome");
//       String meucurso = request.getParameter("curso");
//       
//       out.println("<h1>Execu��o do m�todo doGet() realizada por: " + meunome + ", do curso " + meucurso + ".</h1>");
//       
//       
//       System.out.println("Execu��o do m�todo doGet() definindo no Servlet.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

package qintess.academiajava.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String usuario = request.getParameter("txtNome");
			String senha = request.getParameter("txtSenha");

			// Vamos supor que tanto o usuario como a senha devam ser 'Admin'.
		
			if (usuario.equals("admin") && senha.equals("admin")) {

				response.sendRedirect("home.jsp");
			} else {
				throw new Exception("Usu�rio ou senha invalidos");
			}

		} catch (Exception e) {
			request.setAttribute("mensagem", e.getMessage());
			request.getRequestDispatcher("erro.jsp").forward(request, response);
		}
	}

}

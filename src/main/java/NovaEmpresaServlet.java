

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.alura.gerenciador.Empresa;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("Cadastrando nova empresa");
		 
	        String nomeEmpresa = request.getParameter("nome");
	        Empresa empresa = new Empresa();
	        empresa.setNome(nomeEmpresa);
	        PrintWriter out = response.getWriter();
	        out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");
	}

}

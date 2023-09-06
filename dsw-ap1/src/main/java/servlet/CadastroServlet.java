package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Pessoa;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet(urlPatterns = "/CadastroServlet")
public class CadastroServlet extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Pessoa p1 = new Pessoa();
		int idadeFormat = Integer.parseInt(request.getParameter("idadeP"));
		String nome = request.getParameter("nomeP");
		
		p1.setNome(nome);
		p1.setIdade(idadeFormat);
		
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
		
		PrintWriter writer = response.getWriter();
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<meta charset=\"ISO-8859-1\">");
		writer.write("<title>Cadastro efetuado com sucesso</title>");
		writer.write("</head>");
		writer.write("<body>");
		writer.write("<ol>");
		
		writer.write("<li>");
		writer.write(p1.getNome());
		writer.write("</li>");
		
		writer.write("<li>");
		writer.write("" + p1.getIdade());
		writer.write("</li>");
		
		writer.write("</ol>");
		writer.write("Pessoa cadastrada com sucesso!<br>");
		writer.write("<a href=\"index.html\">voltar</a><br>");
		writer.write("</body>");
		writer.write("</html>");
	}

}

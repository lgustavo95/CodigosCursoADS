package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.BancodeDados;
import entidades.Aluno;
import util.Helper;

/**
 * Servlet implementation class AlunoServlet
 */
@WebServlet(urlPatterns = "/cadastroServlet")
public class AlunoServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		Aluno aluno = new Aluno();
		aluno.setMatricula(req.getParameter("matriculaP"));
		aluno.setNome(req.getParameter("nomeP"));
		BancodeDados.insert(aluno);
		
		System.out.println(aluno.getMatricula());
		System.out.println(aluno.getNome());
		
		PrintWriter writer = resp.getWriter();
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<meta charset=\"ISO-8859-1\">");
		writer.write("<title>Pagina inicial</title>");
		writer.write("</head>");
		writer.write("<body>");
		writer.write("Aluno cadastrado com sucesso<br>");
		writer.write(Helper.formatarData(new Date())+"<br>");
		writer.write("<a href=\"index.html\">voltar</a><br>");
		writer.write("<table><thead>");
		writer.write("<tr><th>Nome</th><th>Matricula</th></tr>");
		writer.write("</thead><tbody>");
		writer.write(Helper.retornarLinhas());
		writer.write("</tbody></table>");
		writer.write("</body>");
		writer.write("</html>");
		
		
    }

}

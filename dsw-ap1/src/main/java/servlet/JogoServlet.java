package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JogoServlet
 */
@WebServlet("/JogoServlet")
public class JogoServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// transformei em inteiros o texto dos inputs
		int numero1 = Integer.parseInt(request.getParameter("num1"));
		int numero2 = Integer.parseInt(request.getParameter("num2"));
		int numero3 = Integer.parseInt(request.getParameter("num3"));
		int numero4 = Integer.parseInt(request.getParameter("num4"));
		int numero5 = Integer.parseInt(request.getParameter("num5"));
		
		// fiz um array de tamanho 5 pra guardar meus numeros abaixo em cada indice
		int[] numeros = new int[5]; 
		numeros[0]    = numero1;
		numeros[1]    = numero2;
		numeros[2]    = numero3;
		numeros[3]    = numero4;
		numeros[4]    = numero5;
		 
		// criei minhas variaveis min e max com valores default no min sendo o max e o max sendo o min.
		// pois se o max for maxValue nunca iria entrar na condição ja que ele o maximo valor possivel.
		int numMaior = Integer.MIN_VALUE;
		int numMenor = Integer.MAX_VALUE;
		
		// fiz o for para percorrer cada indice que tem meu numero de input e 
		//verifiquei se é maior ou menor que o numero anterior.
		for(int i = 0; i < numeros.length; i++) {
			if (numeros[i] > numMaior) {
                numMaior = numeros[i];
            }

            if (numeros[i] < numMenor) {
                numMenor = numeros[i];
            }
		}
		
		System.out.println("Maior: " + numMaior);
		System.out.println("Menor: " + numMenor);
		
		PrintWriter writer = response.getWriter();
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<meta charset=\"ISO-8859-1\">");
		writer.write("<title>Maior & Menor</title>");
		writer.write("</head>");
		writer.write("<body>");
		writer.write("<ul>");
		
		writer.write("<li>");
		writer.write("Maior: " + numMaior);
		writer.write("</li>");
		
		writer.write("<li>");
		writer.write("Menor: " + numMenor);
		writer.write("</li>");
		
		writer.write("</ul>");
		writer.write("Sucesso!<br>");
		writer.write("<a href=\"index.html\">voltar</a><br>");
		writer.write("</body>");
		writer.write("</html>");
	}
}
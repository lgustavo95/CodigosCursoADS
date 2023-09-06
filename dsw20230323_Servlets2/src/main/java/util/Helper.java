package util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import dados.BancodeDados;
import entidades.Aluno;

public class Helper {
	public static String formatarData(Date data) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return sdf.format(data);
	}
	
	public static String retornarLinhas() {
		List<Aluno> lista = BancodeDados.selectAll();
		String linhas = "";
		
		for (Aluno a : lista) {
			linhas += "<tr><td>" + a.getNome() + "</td>"
				   +  "<td>" + a.getMatricula() + "</td></tr>";
		}
		return linhas;
	}
	
	
}


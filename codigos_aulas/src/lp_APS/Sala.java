package lp_APS;

 import java.util.ArrayList;

	public class Sala{
			
	private ArrayList listaDeAlunos;

	public Sala() {			
		ArrayList<Aluno> listaDeAlunos;
		
		this.listaDeAlunos = new ArrayList<Aluno>();
		
		}
			
		void insereAluno (Aluno novoAluno) {
			listaDeAlunos.add(novoAluno);
			
		}
		
		void listarAlunos () {
			System.out.println("lista de alunos ");
		
			for (Aluno alunonalista: listaDeAlunos) {
				alunonalista.Listar();
			}
		
		}
}
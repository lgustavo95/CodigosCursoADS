package lp_APS;

public class Aluno {
		private String nome,matricula;
		
		public Aluno() {
			
		}
		
		public Aluno(String nome,String matricula) {
			setNome(nome);
			setMatricula(matricula);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}	
			
	void Listar() {
		System.out.println("nome: "+ this.nome);
		System.out.println("matricula: "+ this.matricula);
	
	}
}
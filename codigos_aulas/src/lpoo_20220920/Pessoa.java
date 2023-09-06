package lpoo_20220920;

public class Pessoa {
	private String nome;
	private String CPF;
	
	public void definirDados(String novoNome, String novoCPF) {
		nome = novoNome;
		CPF = novoCPF;
	}
	
	public String consultarNome() {
		return nome;
	}
	
	public String consultarCPF() {
		return CPF;
	}

}

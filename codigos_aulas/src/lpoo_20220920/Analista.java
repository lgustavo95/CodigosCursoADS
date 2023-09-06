package lpoo_20220920;

public class Analista extends Pessoa{
	private float Salario;
	
	//get
	public void definirSalario(float novoSalario) {
		Salario = novoSalario;
	}
	//set
	public float consultarSalario() {
		return Salario;
	}
}

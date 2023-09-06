package lpoo_20220920;

public class Dev extends Pessoa {
	private float valorHora;
	
	//get
	public void definirValorHora(float novoValorHora) {
		valorHora = novoValorHora;
	}
	
	//set
	public float consultarValorHora() {
		return valorHora;
	}
}
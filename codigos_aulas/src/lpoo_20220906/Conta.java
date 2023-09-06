package lpoo_20220906;

public class Conta {
	
	public int numero;
	public float saldo;
	public float limite = 500; //atribuiu um valor padrao

	//Sobrecarga de construtores:
	//Construtor Padrao (sem parametros)
	public Conta() {
		
	}
	//Construtor1 (recebe um valor e atribui ao atributo saldo)
	public Conta(float saldoInicial) {
		saldo = saldoInicial;
	}
	//Construtor2 (recebe valores para saldo e limite)
	public Conta(float saldoInicial, float limiteInicial) {
		saldo = saldoInicial;
		limite = limiteInicial;
	}
	
	public float valorSaldo(){
		return saldo;
	}

}

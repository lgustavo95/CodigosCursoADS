package lpoo_20220913;

public class Conta {
	
	public int numero;
	private float saldo;
	
	//metodos get(consultar) e set(modificar) -> encapsulamento
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean Sacar (float valorDoSaque) {
		if (saldo >= valorDoSaque) {
			saldo = saldo - valorDoSaque;
			return true; 
		}else{
			return false;
		}
	}
	
	public void definirNumero(int numero) {
		this.numero = numero;
	}

}

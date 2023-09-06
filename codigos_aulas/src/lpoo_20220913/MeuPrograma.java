package lpoo_20220913;

import java.util.Scanner;

public class MeuPrograma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Conta minhaConta = new Conta();
		minhaConta.definirNumero(12345);
		minhaConta.setSaldo(2000);
		float valorSaque;
		
		System.out.println("Informe o valor do saque:");
		valorSaque = teclado.nextFloat();
		
		System.out.println("== EXTRATO ==");
		System.out.println(">Saldo anterior: " + minhaConta.getSaldo());
		if(minhaConta.Sacar(valorSaque)) {
			System.out.println(">Saque realizado com sucesso!");
		}else{
			System.out.println(">Saque n�o realizado.");
		}
		System.out.println(">Saldo atual: " + minhaConta.getSaldo());
	}

}

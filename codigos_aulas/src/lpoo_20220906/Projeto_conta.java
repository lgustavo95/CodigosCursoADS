package lpoo_20220906;

public class Projeto_conta {

	public static void main(String[] args) {
		
		//Criando objetos do tipo Conta
		Conta contaA = new Conta(101, 200); //Passando argumento para o construtor
				contaA.limite = 1000;
				contaA.numero = 123456;
				contaA.saldo = 10000;
				
		Conta contaB = new Conta(101); //Passando argumento para o construtor
				contaB.limite = 2000;
				contaB.numero = 654321;
				contaB.saldo = 20000;
				
				//Utilizando metodo (imprimindo o retorno do metodo)
				System.out.println("Saldo conta A: " + contaA.valorSaldo());
				System.out.println("Saldo conta B: " + contaB.valorSaldo());
				
				//Testando o valor padrao do atributo limite
				Conta contaC = new Conta(202); //Passando argumento para o construtor
				System.out.println(contaC.limite);
				System.out.println("Saldo conta C: " + contaC.valorSaldo());

				//Testando o Construtor Padrao
				Conta contaD = new Conta();
				contaD.numero = 123;
	}

}
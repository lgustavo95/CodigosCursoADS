package lp20210920;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {	
				Scanner entrada = new Scanner(System.in); //create a Scanner object 
				
				int idade;
				
				System.out.println("Digite a sua idade:");
				idade = entrada.nextInt();
				
				System.out.println("-A sua idade e: " + idade);
				
				if(idade >= 18) {
					System.out.println("Voce e de maior! pode entrar.");
				} else {
					System.out.println("Voce e de menor! nao pode entrar.");
				}
				entrada.close();

	}

}

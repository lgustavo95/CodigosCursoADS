package lp20210920;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
				
	float nota1, nota2, media;
				
				System.out.println("Digite sua primeira nota: ");
				nota1 = entrada.nextFloat();
				System.out.println("Digite a sua segunda nota: ");
				nota2 = entrada.nextFloat();
				
				media = (nota1 + nota2) / 2;
				
				System.out.println("A media e igual a: " + media);
				
				if(media >= 7) {
					System.out.println("Aprovado");	
				} if(media >= 4 && media <= 6.9) {
					System.out.println("Aluno esta na AF");
				}
                entrada.close();
	}

}

package lp20210920;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double media;
		
		System.out.println("Digite a media do aluno:");
		media = entrada.nextDouble();
		
		if(media >= 7) {
			System.out.println("O aluno esta aprovado.");
		} else { 
			if(media >= 4) {
			System.out.println("O aluno esta na final");
			}else {
				System.out.println("O aluno esta reprovado.");
			}
		}
		entrada.close();

	}

}

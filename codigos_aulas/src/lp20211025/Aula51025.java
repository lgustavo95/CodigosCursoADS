package lp20211025;

import java.util.Scanner;

public class Aula51025 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] vetor = new int[5];
		System.out.println("Digite 5 números:");
		for(int i=0;i<5;i++) //este laço define cada elemento do vetor
		{
			System.out.println("-Número"+(i+1));
			vetor[i] = leitor.nextInt();
		}
		for(int i=0;i<5;i++) //este laço exibe na tela cada elemento do vetor
		{
			System.out.println(vetor[i]);
		}
        leitor.close();
	}

}

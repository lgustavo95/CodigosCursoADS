package lp20211025;

import java.util.Scanner;

public class Aula51025 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] vetor = new int[5];
		System.out.println("Digite 5 n�meros:");
		for(int i=0;i<5;i++) //este la�o define cada elemento do vetor
		{
			System.out.println("-N�mero"+(i+1));
			vetor[i] = leitor.nextInt();
		}
		for(int i=0;i<5;i++) //este la�o exibe na tela cada elemento do vetor
		{
			System.out.println(vetor[i]);
		}
        leitor.close();
	}

}

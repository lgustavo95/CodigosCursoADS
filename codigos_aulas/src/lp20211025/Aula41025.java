package lp20211025;

import java.util.Scanner;

public class Aula41025 {

	public static void main(String[] args) {
		int tam;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		tam = leitor.nextInt();
		int[] vet = new int[tam];
		
		//este laço define cada elemento do vetor com i+10
		for (int i=0;i<tam;i++) {
			vet[i]=i+10;
		}
		for(int i=0;i<tam;i++) {
			System.out.println(vet[i]);
		}
		leitor.close();

	}

}

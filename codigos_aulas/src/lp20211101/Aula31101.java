package lp20211101;

import java.util.Scanner;

public class Aula31101 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float[][] notas = new float[3][2];
		int i,j;
		for(i=0;i<3;i++) {
			System.out.println("----digite as notas do aluno"+(i+1));
		for(j=0;j<2;j++) {
			System.out.println("digite a nota"+(j+1));
			notas[i][j]=leitor.nextFloat();
		}
		}
		
		System.out.println("---RELATÓRIO DE NOTAS----");
		for(i=0;i<3;i++) {
			System.out.println("----notas do aluno"+(i+1));
		for(j=0;j<2;j++) {
			System.out.println("Nota"+notas[i][j]);
		}
		}

	}

}

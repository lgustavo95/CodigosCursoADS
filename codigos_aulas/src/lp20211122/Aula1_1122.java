package lp20211122;

import java.util.Scanner;

public class Aula1_1122 {
	
	public static void exibirMsg() {
		System.out.println("Willkommen");
	}
	
	public static double printMediaAluno(double nota1, double nota2) {
		return (nota1 + nota2)/2;
	}
	
	public static void printSoma() {
		int i = 10;
		int j = 20;
		int soma = i+j;
		System.out.println(soma);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double media;
		double notaAP1;
		double notaAP2;
		
		exibirMsg();
		
		System.out.println("informa a nota ap1: ");
		notaAP1 = input.nextDouble();
		System.out.println("informa a nota ap2: ");
		notaAP2 = input.nextDouble();
		
		media = printMediaAluno(notaAP1, notaAP2);
		System.out.println("média calculada: "+ media);
		
		printSoma();
		
		input.close();

	}

}

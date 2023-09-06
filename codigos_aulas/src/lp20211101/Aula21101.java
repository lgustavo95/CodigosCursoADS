package lp20211101;

import java.util.Scanner;

public class Aula21101 {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	char[][] mat = new char[2][3];
	
	System.out.println("digite o 1º elemento da matriz:");
	mat[0][0]=leitor.next().charAt(0);
	System.out.println("digite o 2º elemento da matriz:");
	mat[0][1]=leitor.next().charAt(0);
	System.out.println("elemento 0x0: "+mat[0][0]);
	System.out.println("elemento 0x1: "+mat[0][1]);
	
	leitor.close();

	}

}

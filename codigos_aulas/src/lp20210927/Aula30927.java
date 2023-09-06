package lp20210927;

public class Aula30927 {

	public static void main(String[] args) {
		//3.For
				for (int i=1; i<=50; i=i+2) {
					System.out.println(i);
				}
				
				for(int i=0; ; i=i+2) {
					System.out.println(i);
					if (i==10) {
						break;
					}
				}
				
		//3.1 imprimir números pares
				int a = 10;
				int b = 100;
				
				for(int y=a; y<=b; y++) {
					if (y%2 == 0) {
						System.out.println(y + " é PAR!");
					}else {
						System.out.println(y + " é IMPAR!");
					}
				}

	}

}

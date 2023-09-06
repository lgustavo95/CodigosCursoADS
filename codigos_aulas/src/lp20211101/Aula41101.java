package lp20211101;

public class Aula41101 {

	public static void main(String[] args) {
		int t,i;
		int[][] M = new int[3][4];
		for(t=0;t<3;t++) {
			for(i=0;i<4;i++) {
				M[t][i]=(t*4)+i+1;
			}
		}
		for(t=0;t<3;t++) {
			for(i=0;i<4;i++) {
				System.out.println(M[t][i]);
			}
			System.out.println();
		}
		
		
	}

}

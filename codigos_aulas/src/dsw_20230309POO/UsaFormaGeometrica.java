package dsw_20230309POO;

public class UsaFormaGeometrica {

	public static void main(String[] args) {
		
		Quadrado q = new Quadrado();
		q.setCor("azul");
		q.setTamanhoLado(4.0);
		System.out.println("quadrado---------------");
		q.exibirDados();
		
		Retangulo r = new Retangulo();
		r.setCor("preto");
		r.setTamanhoLado(5.0);
		r.setTamLado2(4.0);
		System.out.println("retangulo-----------------");
		r.exibirDados();
	}
}
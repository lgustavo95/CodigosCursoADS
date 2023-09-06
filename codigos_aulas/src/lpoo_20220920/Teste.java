package lpoo_20220920;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.definirDados("Ludwig", "0246810-12");
		
		//herança
		Analista a1 = new Analista();
		a1.definirDados("Johann", "1357911-13");
		a1.definirSalario(1600);
		
		Dev d1 = new Dev();
		d1.definirDados("Mark", "1234567-89");
		d1.definirValorHora(200);
		
		System.out.println(a1.consultarSalario());
	}

}
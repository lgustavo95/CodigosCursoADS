package dsw_20230309POO;

public class Retangulo extends FormaGeometrica {
	
	private double tamLado2;
	
	public double getTamLado2() {
		return tamLado2;
	}
	public void setTamLado2(double tamLado2) {
		this.tamLado2 = tamLado2;
	}
	
	@Override
	public double calcArea() {
		return getTamLado2() * getTamanhoLado();
	}
	
	@Override
	public double calcPerimetro() {
		return  2 * (getTamanhoLado() + getTamLado2());
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Cor: " + getCor());
		System.out.println("Tamanho do lado: " + getTamanhoLado());
		System.out.println("Tamanho do lado 2: " + tamLado2);
		System.out.println("calculo da area: " + calcArea());
		System.out.println("calculo do perimetro: " + calcPerimetro());
	}
}
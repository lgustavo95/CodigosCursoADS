package dsw_20230309POO;

public abstract class FormaGeometrica {
	
	private String cor;
	private double tamanhoLado;
	
	public abstract double calcArea();
	public abstract double calcPerimetro();
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getTamanhoLado() {
		return tamanhoLado;
	}
	public void setTamanhoLado(double tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}
	
	public void exibirDados() {
		System.out.println("Cor: " + cor);
		System.out.println("Tamanho do lado: " + tamanhoLado);
		System.out.println("calculo da area: " + calcArea());
		System.out.println("calculo do perimetro: " + calcPerimetro());
	}
}
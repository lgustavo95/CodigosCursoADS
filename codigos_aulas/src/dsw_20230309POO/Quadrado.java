package dsw_20230309POO;

public class Quadrado extends FormaGeometrica {
	
	@Override
	public double calcArea() {
		return getTamanhoLado() * getTamanhoLado();
	}
	
	@Override
	public double calcPerimetro() {
		return getTamanhoLado() * 4;
	}
}

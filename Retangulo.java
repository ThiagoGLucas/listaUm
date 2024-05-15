public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo(double novaBase, double novaAltura) {
		this.base = novaBase;
		this.altura = novaAltura;
	}
	
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setBase(double novaBase) {
		this.base = novaBase;
	}
	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}
	
	public double calcularArea() {
		return base * altura;
	}
	public double calcularPerimetro() {
		return 2 * (base + altura);
	}
}

package figuras;

public class Rectangulo extends Figura{
	int base;
	int altura;
	
	public Rectangulo(String r, int b, int a) {
		super(r);
		base = b;
		altura = a;
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getArea() {
		return base * altura;
	}
}

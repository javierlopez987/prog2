package figuras;

public class Triangulo extends Figura{
	int base;
	int altura;
	
	public Triangulo(String n, int b, int a) {
		super(n);
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
		return base * altura / 2;
	}
}

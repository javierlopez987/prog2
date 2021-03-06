package figuras;

public class Circulo extends Figura{
	int radio;
	
	public Circulo(String n, int r) {
		super(n);
		radio = r;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}
}

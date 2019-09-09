package figuras;

public class MedioCirculo extends Circulo{
	
	public MedioCirculo(String n, int r) {
		super(n, r);
	}
	
	public double getArea() {
		return super.getArea() / 2;
	}
}

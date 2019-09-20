package Sueldos;

public class Extra extends Empleado {
	final double EXTRA=200.0;
	int horas;
	
	
	
	public Extra(String n, int d, double s, int h){
		super(n,d,s);
		horas=h;
		
	}
	public double getSueldo() {
		return super.getSueldo()+(EXTRA*horas);
	}

	
}

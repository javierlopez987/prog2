package Sueldos;

public class Comision extends Empleado {
	final double COMISION=1.12;
	double ventas;
	
	public Comision(String n, int d, double s, double v) {
		super(n,d,s);
		ventas=v*COMISION;
	}
	
	public double getSueldo() {
		return super.getSueldo()+ventas;
	}

}

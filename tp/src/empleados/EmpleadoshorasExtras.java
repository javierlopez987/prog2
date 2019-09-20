package empleados;

public class EmpleadoshorasExtras extends Empleado{
	final double extra=200;
	int horas;



	public EmpleadoshorasExtras(String n,int dni,double s, int h) {
		super(n,dni,s);
		horas=h;

	}


	public double getsueldo() {
		return (super.getsueldo()+(extra*horas));
	}

	public String toString() {
		return super.toString() + " cantidad de horas extras " + this.horas + " valor de hs extras " + this.extra + " total: " + this.getsueldo();
	}

}
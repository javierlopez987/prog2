package empleados;

public class Empleado {
	String nombre;
	int dni;
	double sueldo;



	public Empleado (String n,int dni,double s) {
		nombre=n;
		this.dni=dni;
		sueldo=s;
		
	}
	
	public double getsueldo() {
		return sueldo;
	}

}


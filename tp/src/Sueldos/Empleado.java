package Sueldos;

public class Empleado {
	 String nombre;
	 int DNI;
	 double sueldo;
	 
	 public Empleado(String n, int d, double s) {
		 nombre=n;
		 DNI=d;
		 sueldo=s;
	 }
	 
	 public double getSueldo() {
		 return sueldo;
	 }
	 
	 public String toString() {
		 return "Nombre: "+ this.nombre+ "Sueldo: "+ this.sueldo;
	 }
}

package Parcial;
import java.util.ArrayList;
import java.util.Comparator;

public class Comarca extends ElemMundo implements Comparable<Comarca> {
	String nombre;
	int habitantes;
	double sup;
	double ingresos;
	
	public Comarca(String n,int hab,double s, double ing) {
		nombre=n;
		habitantes=hab;
		sup=s;
		ingresos=ing;
		
	}
	public int compareTo(Comarca c) {
		return nombre.compareTo(c.getNombre());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	public double getSup() {
		return sup;
	}

	public void setSup(double sup) {
		this.sup = sup;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}
	
	public ArrayList<Comarca>filtro(Filtro f, Comparator<Comarca>c){
		ArrayList<Comarca>lista=new ArrayList<Comarca>();
		if(f.Cumple(this)) {
			lista.add(this);
			
		}
		return lista;
	}
	
	
	

}

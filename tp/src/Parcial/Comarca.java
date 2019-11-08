package Parcial;
import java.util.ArrayList;

public class Comarca extends ElemMundo {
	String nombre;
	int habitantes;
	double sup;
	double ingresos;
	
	public Comarca(String n) {
		nombre=n;
		
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
	
	public ArrayList<Comarca>filtro(Filtro f){
		ArrayList<Comarca>lista=new ArrayList<Comarca>();
		if(f.Cumple(this)) {
			lista.add(this);
			
		}
		return lista;
	}
	
	
	

}

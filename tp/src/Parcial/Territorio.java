package Parcial;
import java.util.ArrayList;

public class Territorio extends ElemMundo {
	String nombre;
	ArrayList<ElemMundo>comarcas;
			
		public Territorio(String n) {
			nombre=n;
			comarcas=new ArrayList<ElemMundo>();
		}
		
	public int getHabitantes() {
		int suma=0;
		for(ElemMundo e:comarcas) {
			suma+=e.getHabitantes();
			
		}
		return suma;
	}
	
	public double getSup() {
		double suma=0;
		for(ElemMundo e: comarcas) {
			suma+=e.getSup();
		}
		return suma;
	}
	public double getIngresos() {
		double suma=0;
		for(ElemMundo e: comarcas) {
			suma+=e.getIngresos();
		}
		return suma;
	}
	public ArrayList<Comarca> filtro(Filtro f){
		ArrayList<Comarca>lista= new ArrayList<Comarca>();
		for(ElemMundo e: comarcas) {
			lista.addAll(e.filtro(f));
			
		}
		return lista;
	}
			
}


package Parcial;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
	public ArrayList<Comarca> filtro(Filtro f,Comparator<Comarca> c){
		ArrayList<Comarca>lista= new ArrayList<Comarca>();
		for(ElemMundo e: comarcas) {
			lista.addAll(e.filtro(f, c));
			
		}
		
		Collections.sort(lista,c);
		return lista;
	}

	
			
}


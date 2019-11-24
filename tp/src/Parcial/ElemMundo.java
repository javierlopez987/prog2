package Parcial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public abstract class ElemMundo {

	public abstract int getHabitantes();
	public abstract double getSup();
	public abstract double getIngresos();
	public abstract ArrayList<Comarca> filtro(Filtro f, Comparator<Comarca> c);
	
	public double getIngresoPerCapita() {
		return getIngresos()/getHabitantes();
	}
	public double getDensidad() {
		return getHabitantes()/getSup();
	}
}

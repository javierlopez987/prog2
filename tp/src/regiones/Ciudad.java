package regiones;

import java.util.ArrayList;
import java.util.List;

public class Ciudad extends ZonaAbstracta implements Comparable<Ciudad>{
	int habitantes;
	int gastos;
	int ingresos;
	
	public Ciudad(String n, int h, int g, int i) {
		nombre = n;
		habitantes = h;
		gastos = g;
		ingresos = i;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	public int getGastos() {
		return gastos;
	}

	public void setGastos(int gastos) {
		this.gastos = gastos;
	}

	public int getIngresos() {
		return ingresos;
	}

	public void setIngresos(int ingresos) {
		this.ingresos = ingresos;
	}

	public int compareTo(Ciudad otra) {
		return this.getNombre().compareTo(otra.getNombre());
	}
	
	@Override
	public List<Ciudad> getCiudadesDeficit() {
		List<Ciudad> result = new ArrayList<>();
		if(isDeficit()) {
			result.add(this);
		}
		return result;
	}
	
	public List<Ciudad> buscar(Filtro f) {
		List<Ciudad> result = new ArrayList<>();
		if(f.cumple(this)) {
			result.add(this);
		}
		return result;
	}

	@Override
	public String toString() {
		return "\n" + nombre + " [habitantes=" + habitantes + ", gastos=" + gastos + ", ingresos=" + ingresos + "]";
	}
	
	
}

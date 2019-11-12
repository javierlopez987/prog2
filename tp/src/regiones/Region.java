package regiones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Region extends ZonaAbstracta {
	List<ZonaAbstracta> regiones;
	
	public Region(String nombre) {
		this.nombre = nombre;
		regiones = new ArrayList<>();
	}
	
	public void agregar(ZonaAbstracta z) {
		regiones.add(z);
	}
	
	public ZonaAbstracta obtenerHijo (int pos) {
		if (pos >= 0 || pos < regiones.size()) {
			return regiones.get(pos);
		} else {
			return null;
		}
	}

	@Override
	public int getHabitantes() {
		int suma = 0;
		for(ZonaAbstracta z: regiones) {
			suma += z.getHabitantes();
		}
		return suma;
	}

	@Override
	public int getGastos() {
		int suma = 0;
		for(ZonaAbstracta z: regiones) {
			suma += z.getGastos();
		}
		return suma;
	}

	@Override
	public int getIngresos() {
		int suma = 0;
		for(ZonaAbstracta z: regiones) {
			suma += z.getIngresos();
		}
		return suma;
	}
	
	@Override
	public List<Ciudad> getCiudadesDeficit() {
		List<Ciudad> result = new ArrayList<>();
		for (ZonaAbstracta z: regiones) {
			result.addAll(z.getCiudadesDeficit());
		}
		return result;
	}
	
	public List<Ciudad> buscar(Filtro f) {
		List<Ciudad> result = new ArrayList<>();
		for(ZonaAbstracta z: regiones) {
			result.addAll(z.buscar(f));
		}
		return result;
	}
	
	public List<Ciudad> ordenarAsc(List<Ciudad> lista, Comparator<Ciudad> c) {
		List<Ciudad> result = lista;
		Collections.sort(result, c);
		return result;
	}
}

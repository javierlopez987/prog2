package regiones;

import java.util.List;

public abstract class ZonaAbstracta {
	String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean isDeficit() {
		return getGastos() > getIngresos();
	}
	
	public abstract List<Ciudad> getCiudadesDeficit();
	
	public abstract int getHabitantes();
	
	public abstract int getGastos();
	
	public abstract int getIngresos();
}

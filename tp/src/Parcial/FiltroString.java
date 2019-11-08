package Parcial;

public class FiltroString implements Filtro {
	String nombre;
	
	public FiltroString(String n) {
		nombre=n;
	}
	public boolean Cumple(Comarca c) {
		return nombre.equals(c.getNombre());
	}

}

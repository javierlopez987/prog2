package regiones;

public class NombreFiltro extends Filtro{
	String nombre;
	
	public NombreFiltro(String n) {
		nombre = n;
	}
	
	public boolean cumple(Ciudad c) {
		return nombre.equals(c.getNombre());
	}
}

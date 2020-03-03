package Libreria;

public class ClienteComun extends Cliente{
	
	public ClienteComun(String nombre) {
		super(nombre);
	}
	
	public boolean aceptaLibro(Libro l) {
		for(String g: generos_preferidos) {
			if(l.contieneGenero(g)) {
				return true;
			}
		}
		return false;
	}
}

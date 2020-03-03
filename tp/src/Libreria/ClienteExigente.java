package Libreria;

public class ClienteExigente extends Cliente{
	
	public ClienteExigente(String nombre) {
		super(nombre);
	}
	
	public boolean aceptaLibro(Libro l) {
		return l.contieneGeneros(generos_preferidos);
	}
}

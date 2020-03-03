package Libreria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Libro implements Iterable<String>{
	String titulo;
	String autor;
	String resumen;
	List<String> generos;
	int precio;
	
	public Libro(String titulo, String autor, String resumen, int precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.resumen = resumen;
		this.precio = precio;
		generos = new ArrayList<String>();
	}
	
	public int getPrecio() {
		return precio;
	}

	public boolean contieneGenero(String genero) {
		return generos.contains(genero);
	}

	public boolean contieneGeneros(List<String> g) {
		return generos.containsAll(g);
	}

	public Iterator<String> iterator() {
		return generos.iterator();
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
}

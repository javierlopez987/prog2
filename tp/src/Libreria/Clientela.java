package Libreria;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Clientela {
	ArrayList<Libro>libros;
	
	public Clientela() {
		libros=new ArrayList<Libro>();
	}
	
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	public void comprarLibro(Libro l) {
		libros.add(l);
	}
	public int getLibros() {
		return this.libros.size();
	}

	public abstract boolean aceptaLibro(Libro l);
	public abstract double getGastado();
	public abstract int getAntiguedad();
	public abstract ArrayList<Cliente>listar(CriterioDescuento cd, Comparator<Cliente> com);

}

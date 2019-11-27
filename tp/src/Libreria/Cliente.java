package Libreria;

import java.util.ArrayList;

public class Cliente extends ElemLibro implements Clientela {
	private ArrayList<ElemLibro>libros;
	private ArrayList<String>autores;
	private int antiguedad;
	private double gastado;
	private boolean exigente=false;
	private String nombre;
	

		public Cliente(int ant, double g, boolean exi,String n) {
			super();
			this.libros=new ArrayList<ElemLibro>();
			this.autores=new ArrayList<String>();
			this.antiguedad= ant;
			this.gastado= g;
			this.exigente=exi;
			this.nombre=n;
			
		}
		@Override
		public String toString() {
			return "Cliente [nombre=" + nombre + "]";
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public boolean isExigente() {
			return exigente;
		}
		
		public void setExigente(boolean exigente) {
			this.exigente = exigente;
		}
		public void addAutor(String s){
			this.autores.add(s);
		}

		public int getLibros() {
			return libros.size();
		}
		public void comprarLibro(Libro l) {
			this.libros.add(l);
		}

		public void setLibros(ArrayList<ElemLibro> libros) {
			this.libros = libros;
		}

		public ArrayList<String> getAutores() {
			return autores;
		}

		public void setAutores(ArrayList<String> autores) {
			this.autores = autores;
		}

		public int getAntiguedad() {
			return antiguedad;
		}

		public void setAntiguedad(int antiguedad) {
			this.antiguedad = antiguedad;
		}

		public double getGastado() {
			return gastado;
		}

		public void setGastado(double gastado) {
			this.gastado = gastado;
		}
		
	public boolean aceptaLibro(Libro l) {
		boolean accept=false;
		for(String s: generos) {
			if(l.acepta(s)) {
				accept= true;
			}
		}
		return accept;		
	}
	public boolean autorGusta(Libro l) {
		boolean accept=false;
		for(String s:autores) {
			if(l.getAutor().equals(s)) {
				accept=true;
		}
		}
		return accept;
	}
	public boolean aceptaExigente(Libro l) {
		boolean accept=false;
		int contador=0;
		for(String s:generos) {
			if(l.acepta(s)) {
				contador++;
			}
		}
		if(contador==generos.size()&&(this.autorGusta(l)==true)) {
			accept=true;
		}
		return accept;
	}
		
	
}

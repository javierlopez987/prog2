package Libreria;

import java.util.ArrayList;
import java.util.Comparator;

public class Cliente extends Clientela implements Comparable<Cliente> {
	 ArrayList<String>autores;
	 ArrayList<String>generos;
	 int antiguedad;
	 double gastado;
	 String nombre;
	

		public Cliente(int ant, double g,String n) {
			this.autores=new ArrayList<String>();
			this.generos=new ArrayList<String>();
			this.antiguedad= ant;
			this.gastado= g;
			this.nombre=n;
			
		}
		public ArrayList<String> getGeneros() {
			return generos;
		}
		public void setGeneros(ArrayList<String> generos) {
			this.generos = generos;
		}
		public void addGenero(String s) {
			this.generos.add(s);
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
		public void addAutor(String s){
			this.autores.add(s);
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
	public ArrayList<Cliente>listar(CriterioDescuento cd, Comparator<Cliente> com){
		ArrayList<Cliente>lista= new ArrayList<Cliente>();
		if(cd.cumple(this)) {
			lista.add(this);
		}
		return lista;
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
	@Override
	public int compareTo(Cliente otro) {
	return this.nombre.compareTo(otro.getNombre()) ;
	
	}
}

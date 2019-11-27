package Libreria;

import java.util.ArrayList;

public class Libro extends ElemLibro {
	private String nombre;
	private String autor;
	private String resumen;
	private double precio;
	
	
	
		public Libro(String n, String a,String r,double pre) {
			super();
			this.nombre=n;
			this.autor=a;
			this.resumen=r;
			this.precio=pre;
			
		}
		
		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public ArrayList<String> getGeneros() {
			return generos;
		}

		public void setGeneros(ArrayList<String> generos) {
			this.generos = generos;
		}

		public boolean acepta(String s) {
			boolean acepta=false;
			for(String st: this.generos) {
				if(st.equals(s)) {
					acepta=true;
				}
			}
				return acepta;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getResumen() {
			return resumen;
		}

		public void setResumen(String resumen) {
			this.resumen = resumen;
		}

}
			

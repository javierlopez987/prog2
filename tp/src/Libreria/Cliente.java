package Libreria;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente extends Clientela{
	String nombre;
	List<Libro> comprados;
	int antiguedad;
	double total_gastado;
	List<String> autores_preferidos;
	List<String> generos_preferidos;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
		antiguedad = 0;
		total_gastado = 0;
		comprados = new ArrayList<Libro>();
		autores_preferidos = new ArrayList<String>();
		generos_preferidos = new ArrayList<String>();
	}
	
	public abstract boolean aceptaLibro(Libro l);

	public boolean comprar(Libro l, double precio_vta) {
		if(comprados.add(l)) {
			total_gastado += precio_vta;
			return true;
		} else {
			return false;
		}
	}
	
	public double getGastado() {
		return total_gastado;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}
	
	@Override
	public int getCantComprados() {
		return comprados.size();
	}
	
	@Override
	public List<Cliente> buscar(Filtro f) {
		// NO IMPLEMENTADO AUN
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Cliente \n[nombre=" + nombre + ", comprados=" + comprados + getCantComprados() + ", antiguedad=" + antiguedad
				+ ", Total gastado=" + getGastado() + "]\n";
	}
	
}

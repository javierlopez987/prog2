package Libreria;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
	List<Libro> biblioteca;
	Clientela clientes;
	List<Descuento> descuentos;
	
	public Libreria(Clientela clientes) {
		this.clientes = clientes;
		biblioteca = new ArrayList<Libro>();
		descuentos = new ArrayList<Descuento>();
	}
	
	public double getMaximoDescuento(Clientela c) {
		double descMax = 0;
		for(Descuento d: descuentos) {
			if(d.getDescuento(c) > descMax) {
				descMax = d.getDescuento(c);
			}
		}
		return descMax;
	}
	
	public void addDescuento(Descuento d) {
		descuentos.add(d);
	}
	
	public void addLibro(Libro l) {
		biblioteca.add(l);
	}
	
	public double aplicarDescuento(Clientela c, Libro l) {
		return l.getPrecio() * (1 - getMaximoDescuento(c));
	}
	
	public List<Libro> getLibrosRecomendados(Clientela c) {
		List<Libro> result = new ArrayList<Libro>();
		for(Libro l: biblioteca) {
			if(c.aceptaLibro(l)) {
				result.add(l);
			}
		}
		return result;
	}
	
	public void vender(Clientela c, Libro l) {
		double precio_vta = aplicarDescuento(c, l);
		c.comprar(l, precio_vta);
	}

	@Override
	public String toString() {
		return "Libreria [biblioteca=" + biblioteca + ", clientes=" + clientes + ", descuentos=" + descuentos + "]";
	}
	
	
}

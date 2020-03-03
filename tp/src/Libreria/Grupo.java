package Libreria;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends Clientela{
	List<Clientela> clientes;
	
	public Grupo() {
		clientes = new ArrayList<Clientela>();
	}
	
	public boolean comprar(Libro l, double precio_vta) {
		for(Clientela c: clientes) {
			if(c.comprar(l, precio_vta)) {
				return true;
			}
		}
		return false;
	}
	
	public void add(Clientela c) {
		clientes.add(c);
	}
	
	@Override
	public int getAntiguedad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getGastado() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCantComprados() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean aceptaLibro(Libro l) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cliente> buscar(Filtro f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Grupo [clientes=" + clientes + "]";
	}

	
}

package Libreria;

import java.util.ArrayList;

public class GrupoLectura implements Clientela {
	ArrayList<Clientela>clientes;
	
	public GrupoLectura() {
		clientes=new ArrayList<>();
	}
	
	public void addCliente(Clientela c) {
		this.clientes.add(c);
	}
	@Override
	public String toString() {
		return "GrupoLectura [clientes=" + clientes + "]";
	}

	public boolean aceptaLibro(Libro l) {
		boolean accept=false;
		for(Clientela c:clientes) {
			if(c.aceptaLibro(l)) {
				accept=true;
			}
		}
		return accept;
		
	}
	public double getGastado() {
		double suma=0;
		for(Clientela c:clientes) {
			suma+=c.getGastado();
			
		}
		return suma;
	}
	public int getLibros() {
		int suma=0;
		for(Clientela c:clientes) {
			suma+=c.getLibros();
		}
		return suma;
	}
	public int getAntiguedad() {
		int act=0, mayor=0;
		for(Clientela c: clientes) {
			act=c.getAntiguedad();
			if(act>mayor) {
				mayor=act;
			}
		}
		return mayor;
	}
	
	

}

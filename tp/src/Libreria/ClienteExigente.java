package Libreria;

public class ClienteExigente extends Cliente {
	
	

	public ClienteExigente(int ant, double g, String n) {
		super(ant, g, n);
	}

	public boolean aceptaLibro(Libro l) {
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
	



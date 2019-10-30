package biblioteca;

import java.util.Hashtable;
import java.util.Map;

public class Biblioteca {
	Map<Libro, Integer> catalogo;
	
	public Biblioteca() {
		catalogo = new Hashtable<>();
	}
	
	public void add(Libro l) {
		int stock = catalogo.get(l);
		catalogo.put(l, new Integer(++stock));
	}
}

package Libreria;

import java.util.Comparator;

public class ComparadorLibros implements Comparator<Cliente> {

	@Override
	public int compare(Cliente c1, Cliente c2) {
		return Integer.compare(c1.getLibros(),c2.getLibros()) ;
	}

}

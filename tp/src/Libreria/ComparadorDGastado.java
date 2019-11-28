package Libreria;

import java.util.Comparator;

public class ComparadorDGastado implements Comparator<Cliente> {

	@Override
	public int compare(Cliente c1, Cliente c2) {
		return Double.compare(c1.getGastado(), c2.getGastado()) ;
		
	}

}

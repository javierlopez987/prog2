 package Libreria;

public class FiltroComprasMayor implements Filtro{
	int compras;
	
	public FiltroComprasMayor(int compras) {
		this.compras = compras; 
	}
	
	@Override
	public boolean cumple(Clientela c) {
		return c.getCantComprados() > compras;
	}
	
}

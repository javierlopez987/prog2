package Libreria;

import java.util.List;

public abstract class Clientela {
	
	public abstract int getAntiguedad();
	
	public abstract double getGastado();
	
	public abstract int getCantComprados();
	
	public abstract boolean aceptaLibro(Libro l);
	
	public abstract List<Cliente> buscar(Filtro f);
	
	public abstract boolean comprar(Libro l, double precio_vta);
}

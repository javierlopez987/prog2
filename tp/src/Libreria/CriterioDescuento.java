package Libreria;

public interface CriterioDescuento {
	public abstract boolean cumple(Clientela c);
	public abstract int getDescuento();

}

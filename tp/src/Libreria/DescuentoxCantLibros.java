package Libreria;

public class DescuentoxCantLibros implements CriterioDescuento {
int cant;
int descuento;
		public DescuentoxCantLibros(int c, int por) {
			cant=c;
			descuento=por;
		
		}
	@Override
	public boolean cumple(Clientela c) {
		return c.getLibros()>cant;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int porcentaje) {
		this.descuento = porcentaje;
	}
	

}

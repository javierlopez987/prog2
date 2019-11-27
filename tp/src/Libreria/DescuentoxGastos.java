package Libreria;

public class DescuentoxGastos implements CriterioDescuento {
	double cant;
	int descuento;
		 public DescuentoxGastos(int d,double can) {
			cant=can;
			descuento=d;
		}
	@Override
	public boolean cumple(Clientela c) {
		return c.getGastado()>cant;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

}

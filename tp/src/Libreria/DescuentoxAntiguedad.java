package Libreria;

public class DescuentoxAntiguedad implements CriterioDescuento {
	int anios;
	int descuento;
	
	public DescuentoxAntiguedad(int a, int por) {
		anios=a;
		descuento=por;
	}
	
	public boolean cumple(Clientela c) {
		return c.getAntiguedad()>=anios;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int porcentaje) {
		this.descuento = porcentaje;
	}
	
}

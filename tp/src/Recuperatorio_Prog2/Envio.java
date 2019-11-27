package Recuperatorio_Prog2;

import java.util.ArrayList;

public abstract class Envio {
	int traking;
	public abstract ArrayList<Paquete_Carta> Criterio (Criterio c);
	
	public Envio(int t) {
		traking = t;
	}
	public abstract Direccion getDestinatario();
	public abstract Direccion getRemitente();
	public abstract double getPeso();
	public abstract ArrayList<Envio> listar(Criterio c);
	public abstract ArrayList<Envio> getElmens();
	public abstract void addElmens(Envio e);
	public int getTraking() {
		return traking;
	}

	public void setTraking(int traking) {
		this.traking = traking;
	}
	

}

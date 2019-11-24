package Recuperatorio_Prog2;

import java.util.ArrayList;

public abstract class Envio {
	int traking;
	public abstract ArrayList<Paquete_Carta> Criterio (Criterio c);
	
	public Envio(int t) {
		traking = t;
	}
	
	public int getTraking() {
		return traking;
	}

	public void setTraking(int traking) {
		this.traking = traking;
	}
	

}

package Recuperatorio_Prog2;

public abstract class Envio {
	int traking;
	
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
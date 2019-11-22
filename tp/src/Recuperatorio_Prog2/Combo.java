package Recuperatorio_Prog2;

import java.util.ArrayList;

public class Combo extends Envio {
	Criterio acepta;
	ArrayList<Envio>elmens;
	
	public Combo(int t) {
		super(t);
		elmens=new ArrayList<>();
		acepta=null;
	}
	
	public void addElmens(Envio e) {
		if(acepta.cumple(e)) {
			elmens.add(e);
			e.setTraking(this.traking);
		}
	}

	public Criterio getAcepta() {
		return acepta;
	}

	public void setAcepta(Criterio acepta) {
		this.acepta = acepta;
	}

	public ArrayList<Envio> getElmens() {
		return elmens;
	}

	public void setElmens(ArrayList<Envio> elmens) {
		this.elmens = elmens;
	}
	
	

}

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
	
	public void addElmens(Paquete_Carta pc) {
		if(acepta.cumple(pc)) {
			elmens.add(pc);
			pc.setTraking(this.traking);
		}
	}
	


	@Override
	public String toString() {
		return "elmens=" + elmens +", traking="+ traking;
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
	
	public ArrayList<Paquete_Carta> Criterio (Criterio c){
		ArrayList<Paquete_Carta>lista= new ArrayList<Paquete_Carta>();
		for(Envio e: elmens) {
			lista.addAll(e.Criterio(c));
		}
		return lista;
	}
	

}

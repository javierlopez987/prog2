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
	public Direccion getDestinatario() {
		Direccion d=null;
		for(Envio e: elmens) {
			d=e.getDestinatario();
		}
		return d;
	}
	public Direccion getRemitente() {
		Direccion r=null;
		for(Envio e: elmens) {
			r=e.getRemitente();
		}
		return r;
	}
	public double getPeso() {
		double suma=0;
		for(Envio e: elmens) {
			suma+=e.getPeso();
		}
		return suma;
	}
	public ArrayList<Envio>listar(Criterio c){
		ArrayList<Envio>lista=new ArrayList<>();
		for(Envio e:elmens) {
			if(c.cumple(e)) {
				lista.addAll(e.listar(c));
			}
		}
		return lista;
	}
	
	public void addElmens(Envio e) {
		for(int i=0;i<e.getElmens().size();i++) {
			e.addElmens(e);
			if(acepta.cumple(e.getElmens().get(i))) {
				
			e.setTraking(this.traking);
		}
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

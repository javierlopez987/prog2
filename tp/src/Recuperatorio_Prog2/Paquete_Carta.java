package Recuperatorio_Prog2;

import java.util.ArrayList;

public class Paquete_Carta extends Envio {
		
Direccion remitente;
Direccion destinatario;
double peso;
boolean retira;

	public Paquete_Carta(int t,double p, boolean r) {
		super(t);
		peso=p;
		retira=r;
		remitente=null;
		destinatario=null;
	}

	public ArrayList<Envio>listar(Criterio c){
		ArrayList<Envio>lista=new ArrayList<>();
		if(c.cumple(this)) {
			lista.add(this);
		}
		return lista;
		
	}
	
	
	
	public Direccion getRemitente() {
		return remitente;
	}

	public void setRemitente(Direccion remitente) {
		this.remitente = remitente;
	}

	@Override
	public String toString() {
		return "Paquete_Carta [remitente=" + remitente.getNombre() + ", destinatario=" + destinatario.getNombre() + ", peso=" + peso
				+ ", retira=" + retira +", traking="+ traking + "]";
	}

	public Direccion getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Direccion destinatario) {
		this.destinatario = destinatario;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isRetira() {
		return retira;
	}

	public void setRetira(boolean retira) {
		this.retira = retira;
	}

	@Override
	public ArrayList<Envio> getElmens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addElmens(Envio e) {
		// TODO Auto-generated method stub
		
	}
	
			
}

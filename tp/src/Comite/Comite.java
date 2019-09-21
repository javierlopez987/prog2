package Comite;
import java.util.*;

public class Comite {
	Vector<Evaluador> evaluadores;
	Vector<Trabajo> trabajos;
	Vector<String> temas_especiales;
		
	public Comite () {
		evaluadores = new Vector<Evaluador>();
		trabajos = new Vector<Trabajo>();
		temas_especiales = new Vector<String>();
	}
	
	public void addEvaluador(Evaluador e) {
		evaluadores.add(e);
	}
	
	public void addTrabajo(Trabajo t) {
		trabajos.add(t);
	}
	
	public void addTemaEspecial(String tema) {
		temas_especiales.add(tema);
	}
	
	public boolean isExperto(Evaluador e) {
		for(String t_e: temas_especiales) {
			if(e.conoce(t_e)) {
				return true;
			}
		}
		return false;
	}
	
	public String getEvaluador(Trabajo t) {
		for(Evaluador e: evaluadores) {
			if(e.tiene(t)) {
				return e.getNombre();
			}
		}
		return null;
	}
	
	public void imprimirTrabajos(Evaluador e) {
		for(Trabajo t: trabajos) {
			if(e.tiene(t)) {
				System.out.println(t);
			}
		}
	}
	
	public Trabajo getTrabajo(int i) {
		if(i < trabajos.size()) {
			return trabajos.elementAt(i);
		}
		return null;
	}
	
	public int getTrabajosSize() {
		return trabajos.size();
	}
}

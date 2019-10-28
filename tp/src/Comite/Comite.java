package Comite;
import java.util.*;

public class Comite {
	Vector<Evaluador> evaluadores;
	Vector<Trabajo> trabajos;
	Vector<String> temas_especiales;
		
	public Comite() {
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
	
	public void asignarUnTrabajoEvaluador(Trabajo t, Evaluador e) {
		if(e.aptoTrabajo(t)) {
			e.addTrabajo(t);
		}
	}
	
	public void asignarTrabajosEvaluadores() {
		for(Evaluador e: evaluadores) {
			for(Trabajo t: trabajos) {
				if(e.aptoTrabajo(t)) {
					e.addTrabajo(t);
				}
			}
		}
	}
	
	//Obtener lista evaluadores que pueden evaluar un trabajo
	

	public void imprimirTrabajos() {
		for(Evaluador e:evaluadores) {
			imprimirTrabajos(e);
		}
	}
	
	public void imprimirTrabajos(Evaluador e) {
		for(Trabajo t: trabajos) {
			if(e.tiene(t)) {
				System.out.println(e+": "+t);
			}
		}
	}
	
	public void imprimirEvaluador(Trabajo t) {
		for(Evaluador e: evaluadores) {
			if(e.tiene(t)) {
				System.out.println(t.getNombre() + ": " + e.getNombre());
			}
		}
	}
	
	public void imprimirCantTrabajos(Evaluador e) {
		System.out.println(e.getNombre() + ". Cantidad de trabajos: " + e.getCantTrabajos());
	}
	
	public void imprimirExperto(Evaluador e) {
		if(isExperto(e)) {
			System.out.println(e.getNombre() + ": Experto.");
		} else {
			System.out.println(e.getNombre() + ": Común.");
		}
	}
}



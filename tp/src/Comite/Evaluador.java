package Comite;
import java.util.*;

public class Evaluador {
	String nombre;
	Vector<String> temas;
	Vector<Trabajo> trabajos;
	
	public Evaluador(String n) {
		nombre = n;
		temas = new Vector<String>();
		trabajos = new Vector<Trabajo>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean conoce(String tema) {
		return temas.contains(tema);
	}
	
	public boolean aptoTrabajo(Trabajo t) {
		return t.aptoEvaluador(this);
	}
	
	public void addTema(String tema) {
		temas.add(tema);
	}
	
	public void addTrabajo(Trabajo t) {
		trabajos.add(t);
	}
	
	public boolean tiene(Trabajo t) {
		return trabajos.contains(t);
	}
	
	public int getCantTrabajos() {
		return trabajos.size();
	}
}

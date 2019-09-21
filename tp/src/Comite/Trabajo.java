package Comite;
import java.util.*;

public class Trabajo {
	Vector<String> keywords;
	Vector<Evaluador> evaluadores;
	
	public Trabajo() {
		keywords = new Vector<String>();
		evaluadores = new Vector<Evaluador>();
	}
	
	public void addKeyword(String kw) {
		keywords.add(kw);
	}
	
	public void addEvaluador(Evaluador e) {
		evaluadores.add(e);
	}
	
	public boolean aptoEvaluador(Evaluador e) {
		boolean apto = false;
		for(String t: keywords) {
			if (e.conoce(t)) {
				apto = true;
			} else {
				return false;
			}
		}
		return apto;
	}
}

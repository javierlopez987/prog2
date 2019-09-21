package Comite;

public class Poster extends Trabajo{
	
	public Poster() {
		super();
	}
	public boolean aptoEvaluador(Evaluador e) {
		for(String t: keywords) {
			if (e.conoce(t)) {
				return true;
			}
		}
		return false;
	}
}

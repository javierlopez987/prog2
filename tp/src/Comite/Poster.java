package Comite;

public class Poster extends Trabajo{
	
	public Poster(String n) {
		super(n);
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

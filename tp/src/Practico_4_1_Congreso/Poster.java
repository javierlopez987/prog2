package Practico_4_1_Congreso;

public class Poster extends Trabajo {


	public Poster() {
		super();
	}
	
	public boolean AptoEvaluador(EvaluadorB e) {
		for (String s: palabrasclaves) {
				if (e.conoce(s)) {
					return true;
				}
		}
		return false;
	}
	
	
}


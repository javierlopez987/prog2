package Practico_4_1_Congreso;
import java.util.ArrayList;

public class Trabajo {

	ArrayList<String>palabrasclaves;
	ArrayList<EvaluadorB>evaluadores;


public Trabajo() {
	palabrasclaves= new ArrayList<String>();
	evaluadores= new ArrayList<EvaluadorB>();
}


public boolean AptoEvaluador(EvaluadorB e) {
	boolean esApto=false;
	for (String s: palabrasclaves) {
			if (e.conoce(s)) {
				esApto=true;
			}else
					return false;
			}
		return esApto; 
	}

}
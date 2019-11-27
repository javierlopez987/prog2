package Practico_4_1_Congreso;
import java.util.ArrayList;

public class Trabajo {
	String nombre;
	ArrayList<String>palabrasclaves;
	ArrayList<EvaluadorB>evaluadores;


public Trabajo(String n) {
	nombre=n;
	palabrasclaves= new ArrayList<String>();
	evaluadores= new ArrayList<EvaluadorB>();
}

public String getNombre() {
	return nombre;
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


public void addpalabrasclaves(String claves) {
	palabrasclaves.add(claves);
}

public void addEvaluador(EvaluadorB e) {
	evaluadores.add(e);
}

}
package Practico_4_1_Congreso;
import java.util.ArrayList;
public class Congreso {
	ArrayList<EvaluadorB>evaluadores;
	ArrayList<Trabajo>trabajos;
	ArrayList<String>tema_expert;

	
	public Congreso() {
		evaluadores=new ArrayList<EvaluadorB>();
		trabajos=new ArrayList<Trabajo>();
		tema_expert=new ArrayList<String>();
	}
	
	
	public void addEvaluadores(EvaluadorB e) {
		evaluadores.add(e);
	}

	public void addTrabajos(Trabajo t) {
		trabajos.add(t);
	}
		
	
	
	
}






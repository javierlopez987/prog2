package Comite;

public class Sistema_comite_evaluadores {

	public static void main(String[] args) {
		Comite comite = new Comite();
		
		String tema1 = "algoritmos";
		String tema2 = "lenguajes de programación";
		String especial1 = "agentes";
		String especial2 = "visualizacion";
		String especial3 = "redes de comunicacion";
		
		Evaluador e1 = new Evaluador("Evaluador 1");
		Evaluador e2 = new Evaluador("Evaluador 2");
		Evaluador e3 = new Evaluador("Evaluador 3");
		Evaluador e4 = new Evaluador("Evaluador 4");
		
		Trabajo t1 = new Trabajo("Trabajo 1");
		Trabajo t2 = new Trabajo("Trabajo 2");
		Trabajo t3 = new Poster("Trabajo 3");
		Trabajo t4 = new Poster("Trabajo 4");
		Trabajo t5 = new Poster("Trabajo 5");
		
		e1.addTema(tema1);
		e1.addTema(tema2);
		e2.addTema(especial1);
		e3.addTema(especial1);
		e3.addTema(especial2);
		e3.addTema(especial3);
		e4.addTema(tema2);
		
		t1.addKeyword(tema1);
		t1.addKeyword(tema2);
		t2.addKeyword(especial3);
		t2.addKeyword(tema1);
		t3.addKeyword(especial2);
		t4.addKeyword(especial3);
		t4.addKeyword(especial2);
		t4.addKeyword(especial1);
		t5.addKeyword(tema2);
		
		
		comite.addEvaluador(e1);
		comite.addEvaluador(e2);
		comite.addEvaluador(e3);
		comite.addEvaluador(e4);
		comite.addTrabajo(t1);
		comite.addTrabajo(t2);
		comite.addTrabajo(t3);
		comite.addTrabajo(t4);
		comite.addTrabajo(t5);
		comite.addTemaEspecial(especial1);
		comite.addTemaEspecial(especial2);
		comite.addTemaEspecial(especial3);
		
		comite.asignarTrabajosEvaluadores();
		comite.imprimirTrabajos();
//		comite.asignarUnTrabajoEvaluador(t1, e1);
//		comite.asignarUnTrabajoEvaluador(t2, e1);
//		comite.asignarUnTrabajoEvaluador(t3, e2);
//		comite.asignarUnTrabajoEvaluador(t3, e3);
		
//		comite.imprimirTrabajos(e1);
//		comite.imprimirEvaluador(t3);
//		comite.imprimirCantTrabajos(e1);
//		comite.imprimirExperto(e2);
	}

}

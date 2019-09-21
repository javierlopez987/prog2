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
		
		Trabajo t1 = new Trabajo();
		Trabajo t2 = new Trabajo();
		Trabajo t3 = new Poster();
		Trabajo t4 = new Poster();
		
		e1.addTema(tema1);
		e1.addTema(tema2);
		e2.addTema(especial1);
		e3.addTema(especial1);
		e3.addTema(especial2);
		e3.addTema(especial3);
		e4.addTema(tema2);
		
		e1.addTrabajo(t1);
		e1.addTrabajo(t2);
		e2.addTrabajo(t3);
		
		t1.addKeyword(tema1);
		t1.addKeyword(tema2);
		t2.addKeyword(especial3);
		t2.addKeyword(tema1);
		t3.addKeyword(especial2);
		t4.addKeyword(especial3);
		t4.addKeyword(especial2);
		t4.addKeyword(especial1);
		
		comite.addEvaluador(e1);
		comite.addEvaluador(e2);
		comite.addEvaluador(e3);
		comite.addEvaluador(e4);
		comite.addTrabajo(t1);
		comite.addTrabajo(t2);
		comite.addTrabajo(t3);
		comite.addTrabajo(t4);
		comite.addTemaEspecial(especial1);
		comite.addTemaEspecial(especial2);
		comite.addTemaEspecial(especial3);
		
		System.out.println(e1.getNombre() + ": " + comite.isExperto(e1));
		System.out.println(e2.getNombre() + ": " + comite.isExperto(e2));
		System.out.println(e3.getNombre() + ": " + comite.isExperto(e3));
		System.out.println(e4.getNombre() + ": " + comite.isExperto(e4));
		
		comite.imprimirTrabajos(e1);
		
		int i = 0;
		while(i < comite.getTrabajosSize()) {
			if(comite.getEvaluador(comite.getTrabajo(i)) != null) {
				System.out.println(comite.getEvaluador(comite.getTrabajo(i)));
			}
			i++;
		}
	}

}

package Practico_4_1_Congreso;

public class Sistema_Congreso {
	public static void main(String[] args) {
	Comite comite = new Comite();
	
	EvaluadorB eva1 = new EvaluadorB("1");
	EvaluadorB eva2 = new EvaluadorB("2");
	EvaluadorB eva3 = new EvaluadorB("3");
	EvaluadorB eva4 = new EvaluadorB("4");
	
	String tema1= new String("programacion 1");
	String tema2= new String("matematica 1");
	String temaespecial1= new String("angular");
	String temaespecial2= new String("saas");
	String temaespecial3= new String("php");
	
	
	Trabajo t1= new Trabajo("trabajo A");
	Trabajo t2= new Trabajo("trabajo B");
	Trabajo t3= new Poster("poster A");
	
	eva1.addTema(tema1);
	eva1.addTema(tema2);
	eva2.addTema(temaespecial1);
	eva2.addTema(temaespecial2);
	eva3.addTema(temaespecial3);
	eva3.addTema(tema2);
	eva4.addTema(temaespecial3);
	
	t1.addpalabrasclaves(temaespecial1);
	t1.addpalabrasclaves(temaespecial3);
	t2.addpalabrasclaves(tema1);
	t2.addpalabrasclaves(tema2);
	t3.addpalabrasclaves(temaespecial2);

	comite.addEvaluadores(eva1);
	comite.addEvaluadores(eva2);
	comite.addEvaluadores(eva3);
	comite.addEvaluadores(eva4);
	comite.addTrabajos(t1);
	comite.addTrabajos(t2);
	comite.addTrabajos(t3);
	comite.addTemas_expertos(temaespecial1);
	comite.addTemas_expertos(temaespecial2);
	comite.addTemas_expertos(temaespecial3);
	System.out.println("-------------------------------");
	comite.asignarunTPevaluador(t1, eva1);
	comite.asignarunTPevaluador(t2,eva1);
	comite.asignarunTPevaluador(t3, eva4);
	comite.asignarunTPevaluador(t3, eva1);
	comite.asignarunTPevaluador(t3, eva2);
	System.out.println("-------------------------------");
	comite.imprimirTrabajos(eva1);
	comite.imprimirTrabajos(eva2);
	comite.imprimirTrabajos(eva3);
	comite.imprimirTrabajos(eva4);
	System.out.println("-------------------------------");
	comite.imprimirEvaluador(t1);
	comite.imprimirEvaluador(t2);
	comite.imprimirEvaluador(t3);
	System.out.println("-------------------------------");
	comite.cantTrabajos(eva1);
	comite.cantTrabajos(eva2);
	comite.cantTrabajos(eva3);
	comite.cantTrabajos(eva4);
	System.out.println("-------------------------------");
	comite.tipodeEvaluador(eva1);
	comite.tipodeEvaluador(eva2);
	comite.tipodeEvaluador(eva3);
	comite.tipodeEvaluador(eva4);
	}	
	
	
}
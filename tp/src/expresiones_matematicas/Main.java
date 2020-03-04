package expresiones_matematicas;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elemento e1 = new Numero((float) 1);
		Elemento e2 = new Numero((float) 2);
		Elemento e3 = new Numero((float) 3);
		Elemento e4 = new Numero((float) 4);
		Elemento e5 = new Numero((float) 5);
		Elemento e6 = new Numero((float) 6);
		Elemento e7 = new Numero((float) 7);
		Elemento e8 = new Numero((float) 8);
		Elemento e9 = new Numero((float) 9);
		
		Elemento e101 = new Suma(e2, e3);
		Elemento e102 = new Suma(e5, e5);
		Elemento e103 = new Resta(e3, e102);
		
		Expresion op1 = new Suma(e101, e5);
		Expresion op2 = new Suma(e9, e5);
		Expresion op4 = new Producto(e102, e103);
		Expresion op5 = new Division(new Suma(e7, e8), new Resta(e5, e3));
		Expresion op6 = new Producto(new Producto(e5, e5), e4);
		Expresion op7 = new Suma(op6, op4);
		Expresion op8 = new Producto(new Suma(e5, e1), new Resta(e6,e101));
//		System.out.println(op4);
		
//		System.out.println(op4.getValor());
//		System.out.println(op4.getNumeros());
//		System.out.println(op4.getOperadores());
		
		Sistema s1 = new Sistema();
		s1.add(op4);
		s1.add(op7);
		s1.add(op6);
		s1.add(op5);
		s1.add(op1);
		s1.add(op8);
		s1.add(op2);
		
		Comparator<Elemento> porResultado = new ComparadorResultado();
		Comparator<Elemento> porCantOperadores = new ComparadorCantOperadores();
		Comparator<Elemento> porStringExpresion = new ComparadorStringExpresion();
		
		for(Elemento e: s1) {
			System.out.println(e);
		}
		
		s1.listarOrdenado(porResultado);
		
		for(Elemento e: s1) {
			System.out.println(e.getValor());
		}
		
		s1.listarOrdenado(porCantOperadores);
		
		for(Elemento e: s1) {
			System.out.println(e.getCantOperadores());
		}
		
		s1.listarOrdenado(porStringExpresion);
		
		for(Elemento e: s1) {
			System.out.println(e);
		}
	}

}

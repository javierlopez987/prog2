package expresiones_matematicas;

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
		Elemento op1 = new Suma(e101, e5);
		System.out.println(op1);
		
		Elemento e102 = new Suma(e5, e5);
		Elemento e103 = new Resta(e3, e1);
		
		Elemento op4 = new Producto(e102, e103);
		System.out.println(op4);
		
		System.out.println(op4.getValor());
		System.out.println(op4.getNumeros());
		System.out.println(op4.getSimbolos());
	}

}

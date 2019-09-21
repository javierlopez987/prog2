package EjemplosHerencia;

public class Main {

	public static void main(String[] args) {
		
		A a1= new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		A a5 = new E();
		
		System.out.println( a1.a()); //10
		System.out.println( a2.a()); //50
		System.out.println( a3.a()); //15
		System.out.println( a4.a()); //19
		System.out.println( a5.a()); //51
		
		System.out.println( a1.b()); //20
		System.out.println( a2.b()); //20
		System.out.println( a3.b()); //20
		System.out.println( a4.b()); // -1
		System.out.println( a5.b()); //56
		
		System.out.println( a1.valor()); //50
		System.out.println( a1.otroValor()); //40
		System.out.println( a5.otroValor()); //90
		
		//NO SE PUEDE LLAMAR A NINGUN OTRO METODO QUE NO ESTE DECLARADO EN "A"
		
		// a2.z(); NO COMPILA
		
		//Se debe hacer un casting
		
		System.out.println( ((B)a2).z() );//30
		
		//el casting saltea el contro pero puede fallar si no es el objeto apropiado
		
		//	System.out.println( ((B)a3).z() ); // FALLA EN EJECUCION
		
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		E e1 = new E();
		
		System.out.println( b1.a()); //50
		System.out.println( b1.b()); //20
		System.out.println( b1.z() ); //30
		
		System.out.println( e1.a()); //51
		System.out.println( e1.b()); //56
		System.out.println( e1.z() ); //30
		System.out.println( e1.m() ); //81
		
		System.out.println( c1.a()); //15
		System.out.println( c1.b()); //20
		System.out.println( c1.c() ); //100
		
		System.out.println( d1.a()); //19
		System.out.println( d1.b()); //-1
		System.out.println( d1.c() ); //-5
	}
}

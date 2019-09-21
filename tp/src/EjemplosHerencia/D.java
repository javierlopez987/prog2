package EjemplosHerencia;

public class D extends C{

	public int b() {
		return -1;
	}
	
	public int a() {
		return super.a()+4;
	}

}

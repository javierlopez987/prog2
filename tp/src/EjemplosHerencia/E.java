package EjemplosHerencia;

public class E extends B{
	
	
	public int a() {
		return super.a()+1;
	}
	
	public int b() {
		return this.a() +5;
	}
	
	public int m() {
		return a()+ z();
	}

	public int otroValor() {
		return otroValor+50;
	}
}

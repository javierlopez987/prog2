package figuras;

public class ConjuntoFiguras {

	public static void main(String[] args) {
		Circulo c1 = new Circulo("C�rculo 1", 60);
		Triangulo t1 = new Triangulo("Tri�ngulo 1", 50, 20);
		Figura ff1;
		Figura f4;
		
		//System.out.println(c1.getArea());
		//System.out.println(c1.getNombre());
		//System.out.println(c1.getRadio());
		
		double random = Math.random();
		if (random > 0.5) {
			f4 = new Circulo("C�rculo", (int) (random * 60));
			ff1 = t1;
		} else {
			f4 = new Triangulo("Tri�ngulo", (int) (random * 50), (int) (random * 20));
			ff1 = c1;
		}
		System.out.println("La figura " + f4.getNombre() + " tiene un �rea de: " + f4.getArea());
		System.out.println("La figura " + ff1.getNombre() + " tiene un �rea de: " + ff1.getArea());
	}

}

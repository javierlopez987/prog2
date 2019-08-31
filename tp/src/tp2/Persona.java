package tp2;

public class Persona {
	String nombre, apellido, sexo;
	int edad, dni, fechaNac;
	double peso, altura;
	
	public Persona (int doc) {
		dni = doc;
		nombre = "N";
		apellido = "N";
		fechaNac = 01/01/2000;
		sexo = "Femenino";
		edad = 2019 - fechaNac;
		peso = 1;
		altura = 1;
	}
	
	public Persona (int doc, String n, String ap) {
		dni = doc;
		nombre = n;
		apellido = ap;
		fechaNac = 01/01/2000;
		sexo = "Femenino";
		edad = 2019 - fechaNac;
		peso = 1;
		altura = 1;
	}
	
	public Persona (int doc, String n, String ap, int fNac) {
		dni = doc;
		nombre = n;
		apellido = ap;
		fechaNac = fNac;
		sexo = "Femenino";
		edad = 2019 - fechaNac;
		peso = 1;
		altura = 1;
	}
	
	public double getMasaCorporal() {
		final int CUADRADO = 2;
		
		return (peso / Math.pow(altura, CUADRADO));
	}
	
	public boolean isEnForma() {
		final double MIN = 18.5, MAX = 25;
		
		return ((getMasaCorporal() >= MIN) && (getMasaCorporal() <= MAX));
	}
}

package personajes;

public class Juego {

	public static void main(String[] args) {
		FormaAtaque arma1 = new Espada(2);
		FormaAtaque arma2 = new Needle(1);
		FormaAtaque arma3 = new Dragon(2, 0.5);
		
		Personaje snow = new Personaje(15000, 100, 150, arma1);
		Personaje stark = new Personaje(22000, 50, 220, arma2);
		Personaje targeryen = new Personaje(8000, 300, 80, arma3);
		
		snow.atacar(targeryen);
		stark.atacar(snow);
		targeryen.atacar(snow);
		
		System.out.println("Personaje 1: " + snow.getVida());
		System.out.println("Personaje 2: " + stark.getVida());
		System.out.println("Personaje 3: " + targeryen.getVida());
		
		stark.setArma(arma3);
		stark.atacar(targeryen);
		stark.atacar(snow);
		
		System.out.println("Personaje 1: " + snow.getVida());
		System.out.println("Personaje 2: " + stark.getVida());
		System.out.println("Personaje 3: " + targeryen.getVida());
		
	}

}

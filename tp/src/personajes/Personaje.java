package personajes;

public class Personaje {
	int vida;
	int fuerza;
	int poder;
	FormaAtaque arma;
	
	public Personaje(int vida, int fuerza, int puntos, FormaAtaque arma) {
		this.vida = vida;
		this.fuerza = fuerza;
		this.poder = puntos;
		this.arma = arma;
	}

	public void atacar(Personaje enemigo) {
		enemigo.setVida(enemigo.getVida() - (int) arma.getDamage(enemigo));
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getPoder() {
		return poder;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}

	public FormaAtaque getArma() {
		return arma;
	}

	public void setArma(FormaAtaque arma) {
		this.arma = arma;
	}
}

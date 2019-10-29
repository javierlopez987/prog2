package personajes;

public class Espada extends FormaAtaque{
	int multPoder;
	
	public Espada(int multPoder) {
		this.multPoder = multPoder;
	}

	@Override
	public double getDamage(Personaje p) {
		return p.getPoder() * this.getMultPoder();
	}

	public int getMultPoder() {
		return multPoder;
	}
}

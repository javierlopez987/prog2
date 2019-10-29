package personajes;

public class Dragon extends FormaAtaque{
	double multFuerza;
	double multPoder;
	
	public Dragon(double multFuerza, double multPoder) {
		this.multFuerza = multFuerza;
		this.multPoder = multPoder;
	}

	@Override
	public double getDamage(Personaje p) {
		return p.getFuerza() * this.getMultFuerza() + p.getPoder() * this.getMultPoder();
	}

	public double getMultFuerza() {
		return multFuerza;
	}

	public double getMultPoder() {
		return multPoder;
	}
}

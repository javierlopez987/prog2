package personajes;

public class Needle extends FormaAtaque{
	int multFuerza;
	
	public Needle(int multFuerza) {
		this.multFuerza = multFuerza;
	}
	
	@Override
	public double getDamage(Personaje p) {
		return p.getFuerza() * this.getMultFuerza();
	}

	public int getMultFuerza() {
		return multFuerza;
	}
}

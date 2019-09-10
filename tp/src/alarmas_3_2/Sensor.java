package alarmas_3_2;

public class Sensor {
	String zona;
	boolean activado;
	
	public Sensor(String z) {
		zona = z;
		activado = false;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}
	
}

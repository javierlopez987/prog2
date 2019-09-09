package alarmas_3_1;

public class Alarma {
	boolean vidrio, puerta_ventana, movimiento;
	Timbre se�al;
	
	public Alarma() {
		vidrio = false;
		puerta_ventana = false;
		movimiento = false;
		se�al = new Timbre();
	}
	
	public boolean comprobar() {
		if (vidrio || puerta_ventana || movimiento) {
			activar();
			return true;
		}
		return false;
	}

	public void activar() {
		se�al.hacerSonar();
	}
}

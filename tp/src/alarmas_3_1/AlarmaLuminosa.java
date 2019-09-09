package alarmas_3_1;

public class AlarmaLuminosa extends Alarma{
	Luz luz;
	
	public AlarmaLuminosa () {
		super();
		luz = new Luz();
	}
	
	public void activar() {
		super.activar();
		luz.encender();
	}
}

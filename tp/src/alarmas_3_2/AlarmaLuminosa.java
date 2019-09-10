package alarmas_3_2;

public class AlarmaLuminosa extends Alarma{
	Luz luz;
	
	public AlarmaLuminosa () {
		super();
		luz = new Luz();
	}
	
	public void activar(Sensor x) {
		super.activar(x);
		System.out.println("Luz encendida: " + luz.encender());
	}
}

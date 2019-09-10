package alarmas_3_2;
import java.util.*;
public class Alarma {
	Vector<Sensor> sensores;
	Timbre señal;
	
	public Alarma() {
		sensores = new Vector<Sensor>();
		señal = new Timbre();
	}
	
	public void comprobar() {
		for(Sensor s: sensores) {
			if (s.isActivado()) {
				this.activar(s);
			}		
		}
	}

	public void activar(Sensor x) {
		señal.hacerSonar();
		System.out.println(x.getZona());
	}
}

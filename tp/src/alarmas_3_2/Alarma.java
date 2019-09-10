package alarmas_3_2;
import java.util.*;
public class Alarma {
	Vector<Sensor> sensores;
	Timbre se�al;
	
	public Alarma() {
		sensores = new Vector<Sensor>();
		se�al = new Timbre();
	}
	
	public void comprobar() {
		for(Sensor s: sensores) {
			if (s.isActivado()) {
				this.activar(s);
			}		
		}
	}

	public void activar(Sensor x) {
		se�al.hacerSonar();
		System.out.println(x.getZona());
	}
}

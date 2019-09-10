package alarmas_3_2;

public class Central {

	public static void main(String[] args) {
		Alarma a1 = new Alarma();
		AlarmaLuminosa al1 = new AlarmaLuminosa();
		
		Sensor ventana = new Sensor("Ventana dormitorio");
		Sensor puerta = new Sensor("Puerta principal");
		Sensor movimiento = new Sensor("Movimiento patio");
		Sensor casa = new Sensor("Movimiento ADENTRO!!!");
		
		a1.sensores.add(ventana);
		a1.sensores.add(puerta);
		a1.sensores.add(movimiento);
		a1.sensores.add(casa);
		
		//al1.sensores.add(ventana);
		//al1.sensores.add(puerta);
		al1.sensores.add(movimiento);
		al1.sensores.add(casa);
		
		ventana.setActivado(true);
		casa.setActivado(true);
		
		//a1.comprobar();
		al1.comprobar();
		
		
	}

}

package SeleccionFutbol;
import java.util.ArrayList;
import java.time.LocalDate;
public class SeleccionFutbol {
	
	public static void main(String []args) {
		
		ArrayList<Integrante>seleccion;
		
		seleccion=new ArrayList<Integrante>();

		Integrante jugador1= new Integrante("Lionel","Messi",34825712,LocalDate.of(1989,05,03));
	
		Integrante jugador2= new Integrante("Kun","Aguero",35825712,LocalDate.of(1990,07,07));
	
		Integrante tecnico1= new Integrante("kiko","Cosmefulanito",23825712,LocalDate.of(1979,04,06));
	
		Integrante tecnico2= new Integrante("Luis","Alvarez",25825712,LocalDate.of(1989,05,03));
	
		Integrante masajista1= new Integrante("Fernando","Gonzalez",32825712,LocalDate.of(1989,05,03));
		
	
		seleccion.add(jugador1);
		seleccion.add(jugador2);
		seleccion.add(tecnico1);
		seleccion.add(tecnico2);
		seleccion.add(masajista1);
	}
	
	
	
	
	
	
}
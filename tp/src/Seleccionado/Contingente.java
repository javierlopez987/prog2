package Seleccionado;

import java.util.ArrayList;
import java.time.LocalDate;

public class Contingente {

	public static void main(String[] args) {
		ArrayList<Persona>personas;
		personas=new ArrayList<Persona>();
		Persona p1= new Persona(LocalDate.of(1991,10,10),"Jose", "Proz", 1 );
		Persona p2 = new Persona(LocalDate.of(1996,07,13), "Maximiliano", "Santomil",2);
		Persona p3= new Persona(LocalDate.of(1987,01,24),"Javier", "Lopez",3 );
		Persona p4= new Persona(LocalDate.of(1992,02,23),"Carlos", "Lombardoso", 4 );
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		p1.setConcentracion();
		p2.setPaisOrig();
		p3.setViajando();
		p4.setConcentracion();
		
		for(Persona p: personas){
			p.isDisponible();
		}

	}

}

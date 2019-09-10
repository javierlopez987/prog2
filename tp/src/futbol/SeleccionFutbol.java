package futbol;
import java.time.LocalDate;
import java.util.*;

public class SeleccionFutbol {

	public static void main(String[] args) {
		ArrayList<Persona> seleccion;
		seleccion = new ArrayList<Persona>();
		
		Persona f1 = new Persona("Juan", "Gómez", 24256235, LocalDate.of(1980, 06, 24));
		f1.setRolFutbolista();
		f1.setEstadoViajando();
		Persona f2 = new Persona("Sebas", "Masche", 25256235, LocalDate.of(1970, 05, 24));
		f2.setRolFutbolista();
		f2.setEstadoEnConcentracion();
		Persona e1 = new Persona("Tito", "Pérez", 23256235, LocalDate.of(1975, 02, 24));
		e1.setRolEntrenador();
		e1.setEstadoEnConcentracion();
		Persona m1 = new Persona("Elba", "Gallo", 26256235, LocalDate.of(1982, 12, 24));
		m1.setRolMasajista();
		m1.setEstadoPaisOrigen();
		
		seleccion.add(f1);
		seleccion.add(f2);
		seleccion.add(e1);
		seleccion.add(m1);
		
		for(Persona p: seleccion) {
			System.out.println(p.getApellido() + ". " + p.getRol() + ". Disponible?: " + p.isDisponible());
		}
	}

}

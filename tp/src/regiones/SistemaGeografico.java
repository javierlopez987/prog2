package regiones;

import java.util.Comparator;
import java.util.List;

public class SistemaGeografico {

	public static void main(String[] args) {
		ZonaAbstracta gameOfThrones = new Region("Game Of Thrones");
		ZonaAbstracta poniente = new Region("Poniente");
		ZonaAbstracta essos = new Region("Essos");
		ZonaAbstracta sothoryos = new Region("Sothoryos");
		ZonaAbstracta ulthos = new Region("Ulthos");
		((Region) gameOfThrones).agregar(poniente);
		((Region) gameOfThrones).agregar(essos);
		((Region) gameOfThrones).agregar(sothoryos);
		((Region) gameOfThrones).agregar(ulthos);
		
		ZonaAbstracta norte = new Region("Norte");
		ZonaAbstracta sur = new Region("Sur");
		((Region) poniente).agregar(norte);
		((Region) poniente).agregar(sur);
		
		ZonaAbstracta dorne = new Ciudad("Reino De Dorne", 10000, 200000, 50000);
		ZonaAbstracta dominio = new Ciudad("Reino Del Dominio", 5000, 50000, 100000);
		ZonaAbstracta tormentas = new Ciudad("Reino De Las Tormentas", 300, 600000, 3000);
		((Region) sur).agregar(dorne);
		((Region) sur).agregar(dominio);
		((Region) sur).agregar(tormentas);
		
		ZonaAbstracta stark = new Ciudad("Reino Stark", 10000, 200000, 50000);
		ZonaAbstracta lannister = new Ciudad("Reino Lannister", 5000, 50000, 100000);
		ZonaAbstracta capital = new Ciudad("Reino Capital", 300, 600000, 3000);
		((Region) norte).agregar(stark);
		((Region) norte).agregar(lannister);
		((Region) norte).agregar(capital);
		
		ZonaAbstracta libre = new Ciudad("Pueblo Libre", 100000, 100000, 20000);
		((Region) gameOfThrones).agregar(libre);
		
		System.out.println(gameOfThrones.getNombre() + ": Habitantes " + gameOfThrones.getHabitantes());
		System.out.println(gameOfThrones.getNombre() + ": Gastos " + gameOfThrones.getGastos());
		System.out.println(gameOfThrones.getNombre() + ": Ingresos " + gameOfThrones.getIngresos());
		for(Ciudad c: gameOfThrones.getCiudadesDeficit()) {
			System.out.println("Ciudad con deficit: " + c.getNombre());
		}
		
		Filtro libreName = new NombreFiltro("Pueblo Libre");
		Filtro dorneName = new NombreFiltro("Reino De Dorne");
		Filtro norteFilter = new NombreFiltro("Reino Stark");
		Filtro libreOrDorne = new OrFiltro(libreName, dorneName);
		Filtro threeOr = new OrFiltro(libreOrDorne, norteFilter);
		
		((Ciudad) dorne).setIngresos(200000000);
		
		Comparator<Ciudad> c1 = new ComparaIngresos();
		
		List<Ciudad> listaOrd = ((Region) gameOfThrones).ordenarAsc(gameOfThrones.buscar(threeOr), c1);
		
		for(Ciudad c: listaOrd) {
			System.out.println("Ciudad: " + c.getNombre());
		}
	}

}

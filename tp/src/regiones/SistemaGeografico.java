package regiones;

public class SistemaGeografico {

	public static void main(String[] args) {
		ZonaAbstracta gameOfThrones = new Region("Game of Thrones");
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
		
		ZonaAbstracta dorne = new Ciudad("Reino de Dorne", 10000, 200000, 50000);
		ZonaAbstracta dominio = new Ciudad("Reino del Dominio", 5000, 50000, 100000);
		ZonaAbstracta tormentas = new Ciudad("Reino de las Tormentas", 300, 600000, 3000);
		((Region) sur).agregar(dorne);
		((Region) sur).agregar(dominio);
		((Region) sur).agregar(tormentas);
		
		ZonaAbstracta libre = new Ciudad("Pueblo Libre", 100000, 100000, 20000);
		((Region) gameOfThrones).agregar(libre);
		
		System.out.println(gameOfThrones.getNombre() + ": " + gameOfThrones.getHabitantes());
		System.out.println(gameOfThrones.getNombre() + ": " + gameOfThrones.getGastos());
		System.out.println(gameOfThrones.getNombre() + ": " + gameOfThrones.getIngresos());
		for(Ciudad c: gameOfThrones.getCiudadesDeficit()) {
			System.out.println("Ciudad con deficit: " + c.getNombre());
		}
		
		((Ciudad) dorne).setIngresos(350000);
		
		for(Ciudad c: gameOfThrones.getCiudadesDeficit()) {
			System.out.println("Ciudad con deficit: " + c.getNombre());
		}
	}

}

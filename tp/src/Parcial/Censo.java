package Parcial;

public class Censo {

	public static void main(String[] args) {
		Comarca JoseTown= new Comarca("JoseTown", 10000, 13000.0, 120000);
		Comarca MaxiTown= new Comarca("MaxiTown", 4000, 3000, 10000);
		Comarca JaviTown= new Comarca("JaviTown", 7000, 9000, 30000);
		Comarca OvejaNegra=new Comarca("OvejaNegra",120000,30000,300000);
		
		Territorio Tierra=new Territorio("Tierra");
		Territorio Programalandia= new Territorio("Programalandia");
		Programalandia.addComarca(JoseTown);
		Programalandia.addComarca(MaxiTown);
		Programalandia.addComarca(JaviTown);
		Tierra.addComarca(Programalandia);
		Tierra.addComarca(OvejaNegra);
		
		FiltroString str=new FiltroString("MaxiTown");
		FiltroHab hb= new FiltroHab(3999);
		ComparadorPoblacion pob= new ComparadorPoblacion();
		ComparadorNombre nom= new ComparadorNombre();
		
		System.out.println(Tierra.filtro(str,pob));

	}

}

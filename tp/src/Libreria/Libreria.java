package Libreria;

public class Libreria {

	public static void main(String[] args) {
		Libro principito= new Libro("El Principito", "Maquiavelo", "el principe vive alejado de la civilización", 600);
		Cliente maximiliano= new Cliente(2, 0,true,"maxi");
		Cliente jose= new Cliente(3, 0,false,"jose");
		Cliente javier= new Cliente(3, 0,true,"javier");
		Cliente braian= new Cliente(4, 0,true,"braian");
		Cliente mica= new Cliente(3, 0,true,"mica");
		Cliente jor= new Cliente(1, 200,true,"jor");
		Cliente ine= new Cliente(0, 0,true,"ine");
		
		jose.comprarLibro(principito);
		maximiliano.comprarLibro(principito);
		ine.comprarLibro(principito);
		
		
		principito.addGenero("fantasia");
		principito.addGenero("accion");
		principito.addGenero("amor");
		
		maximiliano.addGenero("fantasia");
		maximiliano.addGenero("amor");
		maximiliano.addGenero("accion");
		maximiliano.addAutor("Maquiavelo");
		
		System.out.println(maximiliano.getGeneros());
		System.out.println(maximiliano.aceptaLibro(principito));
		
		DescuentoxAntiguedad antiguedad= new DescuentoxAntiguedad(5, 15);
		DescuentoxCantLibros cantLibros= new DescuentoxCantLibros(2, 10);
		DescuentoxGastos cantGastado= new DescuentoxGastos(20, 1000);
		
		Descuento descuento= new Descuento();
		descuento.addCriterio(cantGastado);
		descuento.addCriterio(cantLibros);
		descuento.addCriterio(antiguedad);
		
		System.out.println(descuento.getDescuento(maximiliano));
		System.out.println(maximiliano.aceptaExigente(principito));
		
		GrupoLectura iluminados= new GrupoLectura();
		GrupoLectura ilustres= new GrupoLectura();
		GrupoLectura grupo= new GrupoLectura();
		iluminados.addCliente(mica);
		iluminados.addCliente(ine);
		iluminados.addCliente(jor);
		ilustres.addCliente(braian);
		ilustres.addCliente(javier);
		ilustres.addCliente(jose);
		ilustres.addCliente(maximiliano);
		grupo.addCliente(ilustres);
		grupo.addCliente(iluminados);
		
		System.out.println(descuento.getDescuento(grupo));
		
		
		
		
		
		
	}

}

package Libreria;

public class Main {

	public static void main(String[] args) {
		Libro principito= new Libro("El Principito", "Maquiavelo", "el principe vive alejado de la civilización", 600);
		Cliente maximiliano= new Cliente(6, 1220,"maxi");
		Cliente jose= new ClienteExigente(7, 0,"jose");
		Cliente javier= new Cliente(6, 0,"javier");
		Cliente braian= new Cliente(8, 0,"braian");
		Cliente mica= new ClienteExigente(12, 0,"mica");
		Cliente jor= new Cliente(15, 200,"jor");
		Cliente ine= new Cliente(5, 2000,"ine");
		
		jose.comprarLibro(principito);
		maximiliano.comprarLibro(principito);
		jor.comprarLibro(principito);
		javier.comprarLibro(principito);
		ine.comprarLibro(principito);
		mica.comprarLibro(principito);
		braian.comprarLibro(principito);
		ine.comprarLibro(principito);
		ine.comprarLibro(principito);
		jose.comprarLibro(principito);
		jose.comprarLibro(principito);
		mica.comprarLibro(principito);
		mica.comprarLibro(principito);
		braian.comprarLibro(principito);
		mica.comprarLibro(principito);
		jose.comprarLibro(principito);
		maximiliano.comprarLibro(principito);
		javier.comprarLibro(principito);
		braian.comprarLibro(principito);
		jor.comprarLibro(principito);
		jose.comprarLibro(principito);
		jose.comprarLibro(principito);
		mica.comprarLibro(principito);
		jor.comprarLibro(principito);
		maximiliano.comprarLibro(principito);
		javier.comprarLibro(principito);
		javier.comprarLibro(principito);
		
		
		
		
		principito.addGenero("fantasia");
		principito.addGenero("accion");
		principito.addGenero("amor");
		
		jose.addGenero("fantasia");
		jose.addGenero("amor");
		jose.addGenero("accion");
		jose.addAutor("Maquiavelo");
		
		System.out.println(maximiliano.getGeneros());
		System.out.println(jose.aceptaLibro(principito));
		
		DescuentoxAntiguedad antiguedad= new DescuentoxAntiguedad(5, 15);
		DescuentoxCantLibros cantLibros= new DescuentoxCantLibros(2, 10);
		DescuentoxGastos cantGastado= new DescuentoxGastos(20, 1000);
		
		Libreria descuento= new Libreria();
		descuento.addCriterio(cantGastado);
		descuento.addCriterio(cantLibros);
		descuento.addCriterio(antiguedad);
		
		System.out.println(descuento.getDescuento(maximiliano));
		
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
		ComparadorDGastado com=new ComparadorDGastado();
		ComparadorLibros lib= new ComparadorLibros();
		
		System.out.println(grupo.listar(cantLibros, lib));
		
		
		
		
		
		
	}

}

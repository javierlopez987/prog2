package Libreria;

public class GestorLibreria {

	public static void main(String[] args) {
		Clientela clientes = new Grupo();
		Clientela nerds = new Grupo();
		Clientela frikis = new Grupo();
		Cliente ernesto = new ClienteComun("ernesto");
		Cliente ernesto1 = new ClienteComun("ernesto1");
		Cliente ernesto2 = new ClienteComun("ernesto2");
		Libreria alfa = new Libreria(clientes);
		
		((Grupo) clientes).add(nerds);
		((Grupo) clientes).add(frikis);
		
		((Grupo) nerds).add(ernesto);
		((Grupo) nerds).add(ernesto1);
		
		((Grupo) frikis).add(ernesto2);
		
		Libro libro1 = new Libro("Las mil y una noches", "Desconocido", "Sin resumen", 250);
		Libro libro2 = new Libro("El Alquimista", "Desconocido", "Sin resumen", 300);
		Libro libro3 = new Libro("El Principito", "Desconocido", "Sin resumen", 450);
		
		Filtro f1 = new FiltroComprasMayor(1);
		Descuento dto1 = new Descuento(f1, 0.20);
		alfa.addDescuento(dto1);
		alfa.addLibro(libro1);
		alfa.addLibro(libro2);
		alfa.addLibro(libro3);
		
		alfa.vender(ernesto1, libro1);
		alfa.vender(frikis, libro2);
		alfa.vender(clientes, libro3);
		
		alfa.vender(ernesto, libro3);
		alfa.vender(ernesto, libro2);
		alfa.vender(ernesto, libro1);
		
		
		System.out.println(alfa);
		
		
	}

}

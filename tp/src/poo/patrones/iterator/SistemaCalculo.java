package poo.patrones.iterator;

public class SistemaCalculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 10;
		VectorF vector = new VectorF(max);
		
    	vector.setValor(0, 13);
    	vector.setValor(2, 99);
    	vector.setValor(5, 35);
		
    	//Creación del iterador
    	IteradorVector iteradorIndividual = vector.iterador1();
    	IteradorVector pasoDoble = vector.iterador2();
    	
    	//Recorrido con el iterador
    	while (iteradorIndividual.hasNext()) {
    		int z = iteradorIndividual.next();
    		System.out.println(z); 
    	}
    	System.out.println();
    	
    	while (pasoDoble.hasNext()) {
    		int x = pasoDoble.next();
    		System.out.println(x); 
    	}
    	System.out.println();
    	
    	for(Integer j: vector.getDatos()) {
    		System.out.println(j);
    	}
	}

}

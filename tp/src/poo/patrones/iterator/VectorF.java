package poo.patrones.iterator;

public class VectorF implements Contenedor{
	private int[] _datos;
	
	public VectorF(int valores){ 
        _datos = new int[valores];
        for (int i = 0; i < _datos.length; i++){
            _datos[i] = 0; 
        }
    }
	
	public int getValor(int pos){ 
        return _datos[pos]; 
    }

    public void setValor(int pos, int valor){ 
        _datos[pos] = valor; 
    }

    public int dimension(){ 
        return _datos.length; 
    }
    
    public int[] getDatos() {
    	return _datos;
    }

	public IteradorVector iterador1() {
		return new IteradorDeUno(this);
	}

	public IteradorVector iterador2() {
		return new IteradorDeDos(this);
	}
}

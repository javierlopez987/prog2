package poo.patrones.iterator;

public class IteradorDeDos implements IteradorVector{
	static int MAX = 2;
	private int[] _vector;
	private int _posicion;
	
	public IteradorDeDos(Contenedor vector) {
		_vector = vector.getDatos();
        _posicion = 0;
    }

    public Integer next(){
	 int valor = _vector[_posicion];
	 _posicion = _posicion + MAX;
	 return valor;
    }
    
    public boolean hasNext() {
		return _posicion < _vector.length;
	}
}

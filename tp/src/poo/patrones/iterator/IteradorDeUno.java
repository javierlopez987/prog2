package poo.patrones.iterator;

public class IteradorDeUno implements IteradorVector{
	private int[] _vector;
	private int _posicion;
	
	public IteradorDeUno(Contenedor vector) {
		_vector = vector.getDatos();
        _posicion = 0;
    }

    public Integer next(){
	 int valor = _vector[_posicion];
	 _posicion++;
	 return valor;
    }

	public boolean hasNext() {
		return _posicion < _vector.length;
	}
}



/**
 * <b>Clase que representa un trago en la logica del juego</b>
 * @author Alimnova
 * @version 1.0
 * @updated 05-may-2010 06:35:41 p.m.
 */
public class Trago {

	/**
	 * Almacena el identificador de cada trago que hay disponible
	 */
	private int numTra;

	public Trago(int numTra) {
		super();
		this.numTra = numTra;
	}

	public Trago(){

	}

	public int getNumTra() {
		return numTra;
	}

	public void setNumTra(int numTra) {
		this.numTra = numTra;
	}

	public void finalize() throws Throwable {

	}

}
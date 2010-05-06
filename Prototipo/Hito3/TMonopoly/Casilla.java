

/**
 * <b>Clase que representa una casilla dentro de la logica del juego</b>
 * @author Alimnova
 * @version 1.0
 * @updated 05-may-2010 06:35:38 p.m.
 */
public class Casilla {

	/**
	 * Almacena el identificador unico de la casilla
	 */
	private int idCasilla;

	public int getIdCasilla() {
		return idCasilla;
	}

	public Casilla(int idCasilla) {
		super();
		this.idCasilla = idCasilla;
	}

	public void setIdCasilla(int idCasilla) {
		this.idCasilla = idCasilla;
	}

	public Casilla(){

	}

	public void finalize() throws Throwable {

	}

}
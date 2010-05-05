

/**
 * <b>Clase que representa una propiedad dentro de la logica del juego</b>
 * @author hp
 * @version 1.0
 * @created 05-may-2010 04:56:14 p.m.
 */
public class Propiedad {

	/**
	 * Almacena el identificador unico de la propiedad
	 */
	private int idPropiedad;
	public Trago m_Trago;
	public EstadoPropiedad m_EstadoPropiedad;

	public Propiedad(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * <b>Maneja los estados de la propiedad (disponible, comprado, vendido)</b>
	 * 
	 * @param estado
	 */
	public void cambiarEstado(EstadoPropiedad estado){

	}

	/**
	 * Metodo encargado de calcular el costo del cover a pagar por la propiedad
	 */
	public int costoCover(){
		return 0;
	}

	/**
	 * Metodo encargado de verificar la disponibilidad(estado) de la propiedad.
	 *   - true: si la propiedad esta disponible
	 *   - false: si la propiedad no esta disponible
	 */
	public boolean verificarDisppropiedad(){
		return false;
	}

}
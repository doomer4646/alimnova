

/**
 * <b>Clase que representa las tarjetas especiales que se encuentran en algunas
 * casillas del tablero de juego</b>
 * @author hp
 * @version 1.0
 * @created 05-may-2010 04:56:20 p.m.
 */
public class TarjetaEspecial {

	/**
	 * Almacena el tipo de la accion que realiza la tarjeta
	 */
	private string descripcion;
	/**
	 * Identificador unico de la tarjeta
	 */
	private int idTarjeta;
	/**
	 * Dice el estado de disponibilidad de la tarjeta:
	 *   - true - esta libre
	 *   - false - no esta libre
	 */
	private boolean libre;

	public TarjetaEspecial(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Metodo encargado de ejecutar la accion señalada por la leyenda de la tarjeta.
	 * 
	 * Parametros:
	 *   leyenda: string:  tipo de accion
	 * 
	 * @param leyenda
	 */
	public void ejecutarLeyenda(string leyenda){

	}

}
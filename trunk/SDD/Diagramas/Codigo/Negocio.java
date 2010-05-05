

/**
 * <b>Es la clase que representa un negocio en la logica del juego</b>
 * @author hp
 * @version 1.0
 * @created 05-may-2010 04:56:09 p.m.
 */
public class Negocio {

	/**
	 * Almacena el monto de dinero ofrecido por el jugador en turno
	 */
	private int dineroOfre;
	/**
	 * Almacena el monto en dinero de los que el ofertante puede pedir tambien a
	 * cambio por alguna propiedad
	 */
	private int dineroRecib;
	/**
	 * Almacena el identficador del jugador ofertante
	 */
	private int idOfer;
	/**
	 * Almacena el identificador del jugador demandado
	 */
	private int idRecep;
	/**
	 * Almacena las propiedades ofrecidas por el jugador demandante
	 */
	private int propiedadOfer[];
	/**
	 * Almacena las propiedades involucradas en la negociacion por parte del jugador
	 * demandado
	 */
	private int propiedadRecib[];

	public Negocio(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Metodo encargado de iniciar el flujo de metodos de un negocio.
	 *   - true: si el negocio se realizo exitosamente
	 *   - false: si el negocio no se realizo exitosamente
	 */
	public boolean realizarNegocio(){
		return false;
	}

	/**
	 * Metodo encargado de verificar si un jugador esta involucrado en una negociacion.
	 * 
	 *   - true: si el jugador esta en la negociacion
	 *   - false: si el jugador no esta en la negociacion
	 * 
	 * @param idJugador
	 */
	public boolean verificarDemandado(int idJugador){
		return false;
	}

}
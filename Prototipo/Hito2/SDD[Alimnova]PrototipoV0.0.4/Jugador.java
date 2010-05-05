

/**
 * <b>Clase que representa a un jugador dentro del juego</b>
 * @author hp
 * @version 1.0
 * @created 05-may-2010 04:56:06 p.m.
 */
public class Jugador {

	/**
	 * Cantidad de dinero que posee el jugador
	 */
	private int dinero;
	/**
	 * Identificador unico de la ficha correspondiente a un jugador
	 */
	private int idFicha;
	/**
	 * Identificador unico del jugador
	 */
	private int idJugador;
	public Partida m_Partida;
	public TarjetaEspecial m_TarjetaEspecial;
	public Perfil m_Perfil;
	public Propiedad m_Propiedad;

	public Jugador(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * <b>Asigna una propiedad al jugador.</b>
	 * 
	 * @param propiedad
	 */
	public void asignarPropiedad(Propiedad propiedad){

	}

	/**
	 * Metodo encargado de determinar el costo de un cover perteneciente a una
	 * propiedad
	 * 
	 * @param propi
	 */
	public int costoCover(Propiedad propi){
		return 0;
	}

	/**
	 * <b>Debitar el dinero correspondiente a una subasta o compra, acorde al precio
	 * de la operación</b>
	 * 
	 * @param precio
	 */
	public void debitar(int precio){

	}

	/**
	 * Metodo encargado de ingresar un jugador a una subasta.
	 *   - true - si ingreso a la subasta
	 *   - false - si no ingreso a la subasta
	 */
	public boolean entrarSubasta(){
		return false;
	}

	/**
	 * 
	 * @param dineroDemandado
	 * @param dineroDemandante
	 * @param propiedadesDemandado
	 * @param propiedadesDemandante[]
	 */
	public void intercambiarPropiedad(int dineroDemandado, int dineroDemandante, ArrayList propiedadesDemandado, ArrayList propiedadesDemandante[]){

	}

	/**
	 * Metodo encargado de sumar el valor pagado de un cover al dinero disponible de
	 * un jugador
	 * 
	 * @param cover
	 */
	public void sumarCover(int cover){

	}

}
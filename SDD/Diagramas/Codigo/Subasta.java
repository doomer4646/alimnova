

/**
 * <b>Clase que representa una subasta dentro del juego</b>
 * @author Alimnova
 * @version 1.0
 * @created 05-may-2010 04:56:19 p.m.
 */
public class Subasta {

	/**
	 * Almacena el identificador del jugador ganador de la subasta
	 */
	private int idGanador;
	/**
	 * Almacena el identificador de la propiedad que esta siendo subastada
	 */
	private int idSubastada;
	/**
	 * Almacena el listado de las ofertas realizadas por los participantes de la
	 * subasta
	 */
	private List<int> ofertas;
	/**
	 * Almacena la lista de los jugadores participantes de en la subasta
	 */
	private List<int> participantes;
	/**
	 * Almacena el precion base establecido para la subasta
	 */
	private int pBase;

	public Subasta(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Metodo encargado de agregar el identificador de un participante a la subasta
	 * 
	 * @param idParticipante
	 */
	public void agregarJugador(int idParticipante){

	}

	/**
	 * Metodo encargado de calcular el precio base de una propiedad dada para la
	 * subasta
	 */
	public static int calcularPrecioBase(){
		return 0;
	}

	/**
	 * <b>Da el ganador de la subasta</b>
	 */
	public int evaluarGanador(){
		return 0;
	}

}
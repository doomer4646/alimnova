import java.util.ArrayList;
import java.util.List;



/**
 * <b>Clase que representa una subasta dentro del juego</b>
 * @author Alimnova
 * @version 1.0
 * @updated 05-may-2010 06:35:40 p.m.
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
	private List<Integer> ofertas;
	/**
	 * Almacena la lista de los jugadores participantes de en la subasta
	 */
	private List<Integer> participantes;
	/**
	 * Almacena el precion base establecido para la subasta
	 */
	private int pBase;
	
	

	public Subasta(int idGanador, int idSubastada,int pBase) {
		super();
		this.idGanador = idGanador;
		this.idSubastada = idSubastada;
		this.ofertas = new ArrayList<Integer>();
		this.participantes = new ArrayList<Integer>();
		this.pBase = pBase;
	}

	public int getIdGanador() {
		return idGanador;
	}

	public void setIdGanador(int idGanador) {
		this.idGanador = idGanador;
	}

	public int getIdSubastada() {
		return idSubastada;
	}

	public void setIdSubastada(int idSubastada) {
		this.idSubastada = idSubastada;
	}

	public List<Integer> getOfertas() {
		return ofertas;
	}

	public void setOfertas(List<Integer> ofertas) {
		this.ofertas = ofertas;
	}

	public List<Integer> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Integer> participantes) {
		this.participantes = participantes;
	}

	public int getpBase() {
		return pBase;
	}

	public void setpBase(int pBase) {
		this.pBase = pBase;
	}

	

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
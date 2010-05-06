import java.util.List;



/**
 * <b>Clase encargada de crear una partida e ingresar los jugadores a la
 * partida</b>
 * @author Alimnova
 * @version 1.0
 * @updated 05-may-2010 06:35:36 p.m.
 */
public class Inicio implements Comunicacion {

	/**
	 * true - si existe una partida
	 * false - si no existe una partida
	 */
	private boolean existePartida;
	public Partida m_Partida;

	
	public Inicio(boolean existePartida, Partida mPartida) {
		super();
		this.existePartida = existePartida;
		m_Partida = mPartida;
	}

	public boolean isExistePartida() {
		return existePartida;
	}

	public void setExistePartida(boolean existePartida) {
		this.existePartida = existePartida;
	}

	public Partida getM_Partida() {
		return m_Partida;
	}

	public void setM_Partida(Partida mPartida) {
		m_Partida = mPartida;
	}

	public Inicio(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * metodo encargado de crear una partida.
	 *   true - si se pudo crear una partida
	 *   false - si no se pudo crear una partida
	 * 
	 * @param nombrePart
	 */
	public boolean crearPartida(String nombrePart){
		return false;
	}

	/**
	 * Metodo encargado de  unir un jugador a una partida.
	 *   - true - si el ingreso a la partida fue exitoso
	 *   - false - si no se pudo ingresar a una partida
	 */
	public boolean ingresarPartida(){
		return false;
	}

	/**
	 * 
	 * @param idCasilla
	 */
	public void solicitarCompra(int idCasilla){

	}

	/**
	 * Metodo presentado por medio de la partida para que el cliete lo pueda solicitar,
	 * es el encargado de recibir el pedido de una subasta por parte del cliente.
	 * Retorna el precio base de la subasta
	 * 
	 * @param idCasilla
	 */
	public int solicitarSubasta(int idCasilla){
		return 0;
	}

	/**
	 * Metodo encargado de informarle a la partida la intencion de un jugador J1 de
	 * realizar un negocio con el jugador J2
	 * 
	 * @param propiedadesJ2
	 * @param propiedadesJ1
	 * @param dineroJ2
	 * @param dineroJ1
	 * @param idJ2
	 * @param idJ1
	 */
	public boolean solicitudNegocio(List<Propiedad> propiedadesJ2, List<Propiedad> propiedadesJ1, int dineroJ2, int dineroJ1, int idJ2, int idJ1){
		return false;
	}

	/**
	 * Metodo que le informa a un jugador si esta participando en un negocio.
	 *   - true: si hay negocio
	 *   - false: si no hay negocio
	 * 
	 * @param idJugador
	 */
	public boolean hayNegocio(int idJugador){
		return false;
	}

	/**
	 * Metodo encargado de validar si la clave de ingreso de un jugador es la correcta.
	 * 
	 *   - true: si la clave es la correcta
	 *   - false: si la clave no es la correcta
	 * 
	 * @param nombre
	 * @param clave
	 */
	public boolean validarClave(String nombre, String clave){
		return false;
	}


}
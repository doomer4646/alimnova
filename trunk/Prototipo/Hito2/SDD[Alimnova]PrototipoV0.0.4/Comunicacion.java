

/**
 * @author hp
 * @version 1.0
 * @created 05-may-2010 04:55:58 p.m.
 */
public interface Comunicacion {

	/**
	 * Metodo invocado desde el cliente para crear una partida a peticion de un
	 * jugador en el subsistema cliente.
	 *   - true: si la partida fue creada con exito
	 *   - false: si la partida no fue creada con exito
	 * 
	 * @param nombre
	 */
	public boolean crearPartida(String nombre);

	/**
	 * Metodo que le informa a un jugador si esta participando en un negocio.
	 *   - true: si hay negocio
	 *   - false: si no hay negocio
	 * 
	 * @param idJugador
	 */
	public boolean hayNegocio(int idJugador);

	/**
	 * 
	 * @param idCasilla
	 */
	public void solicitarCompra(int idCasilla);

	/**
	 * Metodo presentado por medio de la partida para que el cliete lo pueda solicitar,
	 * es el encargado de recibir el pedido de una subasta por parte del cliente.
	 * Retorna el precio base de la subasta
	 * 
	 * @param idCasilla
	 */
	public int solicitarSubasta(int idCasilla);

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
	public boolean solicitudNegocio(ArrayList propiedadesJ2, ArrayList propiedadesJ1, int dineroJ2, int dineroJ1, int idJ2, int idJ1);

	/**
	 * Metodo encargado de validar si la clave de ingreso de un jugador es la correcta.
	 * 
	 *   - true: si la clave es la correcta
	 *   - false: si la clave no es la correcta
	 * 
	 * @param nombre
	 * @param clave
	 */
	public boolean validarClave(String nombre, String clave);

}
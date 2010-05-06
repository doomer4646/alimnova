import java.util.ArrayList;
import java.util.List;



/**
 * <b>Clase que representa la logica de una partida</b>
 * @author hp
 * @version 1.0
 * @updated 05-may-2010 06:35:38 p.m.
 */
public class Partida implements Comunicacion {
	/**
 	* Almacena el nombre dado a la partida
 	*/
	private String nombre;
	/**
	 * Almacena los turnos de los jugadores, permite controlar los turnos de los
	 * jugadores.
	 *   - true: tiene el turno
	 *   - false: no tiene el turno
	 */
	
	private boolean turnos[];
	private Banco m_Banco;
	private List<Casilla> m_Casilla;
	private List<Jugador> m_Jugador;
	private List <TarjetaEspecial> m_TarjetaEspecial;
	private Negocio m_Negocio;
	
	public Partida(String nombre, boolean[] turnos, Banco mBanco, Negocio mNegocio) {
		super();
		this.nombre = nombre;
		this.turnos = turnos;
		m_Banco = mBanco;
		m_Casilla = new ArrayList<Casilla>();
		m_Jugador = new ArrayList<Jugador>();
		m_TarjetaEspecial = new ArrayList<TarjetaEspecial>();
		m_Negocio = mNegocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean[] getTurnos() {
		return turnos;
	}

	public void setTurnos(boolean[] turnos) {
		this.turnos = turnos;
	}

	public Banco getM_Banco() {
		return m_Banco;
	}

	public void setM_Banco(Banco mBanco) {
		m_Banco = mBanco;
	}

	public List<Casilla> getM_Casilla() {
		return m_Casilla;
	}

	public void setM_Casilla(List<Casilla> mCasilla) {
		m_Casilla = mCasilla;
	}

	public List<Jugador> getM_Jugador() {
		return m_Jugador;
	}

	public void setM_Jugador(List<Jugador> mJugador) {
		m_Jugador = mJugador;
	}

	public List<TarjetaEspecial> getM_TarjetaEspecial() {
		return m_TarjetaEspecial;
	}

	public void setM_TarjetaEspecial(List<TarjetaEspecial> mTarjetaEspecial) {
		m_TarjetaEspecial = mTarjetaEspecial;
	}

	public Negocio getM_Negocio() {
		return m_Negocio;
	}

	public void setM_Negocio(Negocio mNegocio) {
		m_Negocio = mNegocio;
	}


	public Partida(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * <b>Cuando contraofertan actualiza los parametros</b>
	 * 
	 * @param propiedadesDemandado
	 * @param propiedadesDemandante
	 * @param dineroDemandado
	 * @param dineroDemandante
	 */
	public void actualizarNegociacion(List<Propiedad> propiedadesDemandado, List<Propiedad> propiedadesDemandante, int dineroDemandado, int dineroDemandante){

	}

	/**
	 * Asigna al jugador 1500 pesos para empezar su borrachera por T-Monopoly
	 */
	public void asignarDinero(){

	}

	/**
	 * Asigna las dos propiedades sencillas al jugador para empezar su borrachera en T-
	 * Monopoly
	 */
	public void asignarPropiedad(){

	}

	/**
	 * Retorna el dueño de una propiedad dado el id de la propiedad
	 * 
	 * @param idProp
	 */
	public int buscarDueno(int idProp){
		return 0;
	}

	/**
	 * Metodo encargado de buscar un jugador por medio del identificador de este
	 * jugador, retorna el jugador identificado con el id del parametro
	 * 
	 * @param idJugador
	 */
	public Jugador buscarJugador(int idJugador){
		return null;
	}

	/**
	 * <b>Busca una propiedad aleatoreamente y la retorna para asignarla.</b>
	 */
	public Propiedad buscarPropAsignar(){
		return null;
	}

	/**
	 * Metodo encargado de calcular el costo del cover de una propiedad segun los
	 * derechos que tenga dado el costo de un cover normal
	 * 
	 * @param coverPropiedad
	 */
	public int costoCover(int coverPropiedad){
		return 0;
	}

	/**
	 * <b>Asigna la responsabilidad al jugador de debitar el dinero correspondiente a
	 * la operación.</b>
	 * 
	 * @param idJugador
	 * @param dinero
	 */
	public void debitar(int idJugador, int dinero){

	}

	/**
	 * Metodo que se encarga de debitar el valor pagado por motivo de un cover a un
	 * determinado jugador
	 * 
	 * @param cover
	 */
	public void debitarCover(int cover){

	}

	/**
	 * Metodo encargado de ejecutar la accion indicada por la leyenda de una tarjeta
	 */
	public void ejecutarTarjeta(){

	}

	/**
	 * Metodo que indica a un jugador si se encuentra en algun negocio.
	 *   - true: si hay negocio
	 *   - false: si no hay negocio
	 * 
	 * @param idJugador
	 */
	public boolean hayNegocio(int idJugador){
		return false;
	}

	/**
	 * Metodo que dado el numero de una casilla retorna el identificador de la
	 * propiedad correspondiente a esa casilla
	 * 
	 * @param idCasilla
	 */
	public int idPropXCasilla(int idCasilla){
		return 0;
	}

	/**
	 * Asigna dinero y propiedades iniciales del juego. 
	 */
	public void iniciarPartida(){

	}

	/**
	 * Metodo encardo de buscar en el arreglo de trunos el jugador que tiene el turno,
	 * retorna la posicion en el arreglo del jugador que tiene el turno.
	 */
	public int jugadorEnTurno(){
		return 0;
	}

	/**
	 * Metodo encargado de realizar la puja hecha por un jugador en la subasta de
	 * determinada propiedad
	 * 
	 * @param dinero
	 * @param idPropiedad
	 * @param idJugador
	 */
	public void pujar(int dinero, int idPropiedad, int idJugador){

	}

	/**
	 * Metodo encargado de ingresar un determinado jugador dado su identificador a una
	 * subasta.
	 *   - true: si el jugador se registro con exito
	 *   - false: si el jugador no se registro con exito
	 * 
	 * @param idJugador
	 */
	public boolean registrarJugadorEnSubasta(int idJugador){
		return false;
	}

	/**
	 * Envia la solicitud para cobrar el cover de una propiedad
	 * 
	 * @param idCasilla
	 * @param saldo
	 * @param idJugador
	 */
	public void solicitarCover(int idCasilla, int saldo, int idJugador){

	}

	/**
	 * Metodo encargado de iniciar el flujo de datos necesario para llevar a cabo una
	 * subasta.
	 * Retorna el precio base para la subasta
	 * 
	 * @param idCasilla
	 */
	public int solicitarSubasta(int idCasilla){
		return 0;
	}

	/**
	 * Metodo encargado de iniciar el llamado a los metodos relacionados con la compra
	 * de una propiedad dado el identificador de la casilla donde se encuentra la
	 * propiedad a comprar.
	 *   -true: si la compra se realizao exitosamente
	 *   - false: si la compra no se realizao exitosamente
	 * 
	 * @param idCasilla
	 */
	public boolean solicitudCompra(int idCasilla){
		return false;
	}

	/**
	 * Inicia una negociación de jugador1(j1) a jugador2 (j2).
	 *   - true: si la solicitud se realizao con exito
	 *   - false: si la solicitud no se realizo con exito
	 * 
	 * @param propiedadesJ2
	 * @param propiedadesJ1
	 * @param dineroJ2
	 * @param dineroJ1
	 * @param idJugador2
	 * @param idJugador1
	 */
	public boolean solicitudNegocio(List<Propiedad> propiedadesJ2,
			List<Propiedad> propiedadesJ1, int dineroJ2, int dineroJ1,
			int idJ2, int idJ1) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Metodo encargado de sumarle a un jugador el valor pagado por un cover de su
	 * propiedad
	 * 
	 * @param cover 
	 */
	public void sumarCover(int cover ){

	}

	/**
	 * <b>Metodo encargado de validar si la contraseña de un jugador corresponde a la
	 * clave registrada.</b>
	 * <b>   - true: si la clave corresponde a la registrada</b>
	 * <b>   - false: si la clave no corresponde a la registrada</b>
	 * 
	 * @param nombre
	 * @param clave
	 */
	public boolean validarClave(String nombre, String clave){
		return false;
	}

	/**
	 * Metodo encargado de validar si un saldo es suficiente para pagar un cover.
	 *   - true: si el saldo es suficiente.
	 *   - false: si el saldo no es suficiente
	 * 
	 * @param saldo
	 * @param cover
	 */
	public boolean validarSaldo(int saldo, int cover){
		return false;
	}

	/**
	 * 
	 * @param idCasilla
	 */
	public void solicitarCompra(int idCasilla){

	}

	/**
	 * Metodo invocado desde el cliente para crear una partida a peticion de un
	 * jugador en el subsistema cliente.
	 *   - true: si la partida fue creada con exito
	 *   - false: si la partida no fue creada con exito
	 * 
	 * @param nombre
	 */
	public boolean crearPartida(String nombre){
		return false;
	}

	
	

}
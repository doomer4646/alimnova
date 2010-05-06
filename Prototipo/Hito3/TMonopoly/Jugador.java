import java.util.ArrayList;
import java.util.List;



/**
 * <b>Clase que representa a un jugador dentro del juego</b>
 * @author hp
 * @version 1.0
 * @updated 05-may-2010 06:35:37 p.m.
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
	public List<TarjetaEspecial> m_TarjetaEspecial;
	public Perfil m_Perfil;
	public List<Propiedad> m_Propiedad;

	
	public Jugador(int dinero, int idFicha, int idJugador, Partida mPartida, Perfil mPerfil) {
		super();
		this.dinero = dinero;
		this.idFicha = idFicha;
		this.idJugador = idJugador;
		m_Partida = mPartida;
		m_TarjetaEspecial = new ArrayList<TarjetaEspecial>();
		m_Perfil = mPerfil;
		m_Propiedad = new ArrayList<Propiedad>();
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getIdFicha() {
		return idFicha;
	}

	public void setIdFicha(int idFicha) {
		this.idFicha = idFicha;
	}

	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	public Partida getM_Partida() {
		return m_Partida;
	}

	public void setM_Partida(Partida mPartida) {
		m_Partida = mPartida;
	}

	public List<TarjetaEspecial> getM_TarjetaEspecial() {
		return m_TarjetaEspecial;
	}

	public void setM_TarjetaEspecial(List<TarjetaEspecial> mTarjetaEspecial) {
		m_TarjetaEspecial = mTarjetaEspecial;
	}

	public Perfil getM_Perfil() {
		return m_Perfil;
	}

	public void setM_Perfil(Perfil mPerfil) {
		m_Perfil = mPerfil;
	}

	public List<Propiedad> getM_Propiedad() {
		return m_Propiedad;
	}

	public void setM_Propiedad(List<Propiedad> mPropiedad) {
		m_Propiedad = mPropiedad;
	}

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
	public void intercambiarPropiedad(int dineroDemandado, int dineroDemandante, List<Propiedad> propiedadesDemandado, List<Propiedad> propiedadesDemandante){

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
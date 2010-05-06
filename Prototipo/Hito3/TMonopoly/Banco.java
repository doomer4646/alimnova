import java.util.ArrayList;
import java.util.List;



/**
 * <b>Clase que representa un banco dentro de la logica del juego</b>
 * @author Alimnova
 * @version 1.0
 * @updated 05-may-2010 06:35:39 p.m.
 */
public class Banco {

	/**
	 * Almacena el numero de cervezas que tiene para vender el banco
	 */
	private int cerveza;
	/**
	 * Almacena la cantidad de dinero que posee el banco
	 */
	private int dinero;
	/**
	 * Almacena el numero de wiskys que puede vender el banco
	 */
	private int wiskys;
	public List<Propiedad> m_Propiedad;
	public List<Trago> m_Trago;
	public Subasta m_Subasta;
	

	public Banco(int cerveza, int dinero, int wiskys, Subasta mSubasta) {
		super();
		this.cerveza = cerveza;
		this.dinero = dinero;
		this.wiskys = wiskys;
		m_Propiedad = new ArrayList<Propiedad>();
		m_Trago = new ArrayList<Trago>();
		m_Subasta = mSubasta;
	}

	public int getCerveza() {
		return cerveza;
	}

	public void setCerveza(int cerveza) {
		this.cerveza = cerveza;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getWiskys() {
		return wiskys;
	}

	public void setWiskys(int wiskys) {
		this.wiskys = wiskys;
	}

	public List<Propiedad> getM_Propiedad() {
		return m_Propiedad;
	}

	public void setM_Propiedad(List<Propiedad> mPropiedad) {
		m_Propiedad = mPropiedad;
	}

	public List<Trago> getM_Trago() {
		return m_Trago;
	}

	public void setM_Trago(List<Trago> mTrago) {
		m_Trago = mTrago;
	}

	public Subasta getM_Subasta() {
		return m_Subasta;
	}

	public void setM_Subasta(Subasta mSubasta) {
		m_Subasta = mSubasta;
	}

	public Banco(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Metodo encargado de actualizar el precio base de una propiedad en subasta
	 * 
	 * @param nuevoPrecio
	 */
	public void actualizarPrecioBase(int nuevoPrecio){

	}

	/**
	 * Metodo que calcula el precio base de una propiedad dao su id.
	 * Retorna el precio base para la subasta de la propiedad
	 * 
	 * @param idPropiedad
	 */
	public int calcularPrecioBase(int idPropiedad){
		return 0;
	}

	/**
	 * Metodo encargado de crear una subasta a peticion de un jugador
	 */
	public Subasta crearSubasta(){
		return null;
	}

	/**
	 * Metodo encargado de cambiar el estado de hipotecado a una propiedad y
	 * devolverla a su respectivo dueño
	 */
	public void deshipotecar(){

	}

	/**
	 * Metodo que fija el precio base inicial de una propiedad que se pone en estado
	 * de hipoteca, retorna el precio base de la propiedad
	 * 
	 * @param prop
	 */
	public int fijarPrecioBase(Propiedad prop){
		return 0;
	}

	/**
	 * Metodo encargado de poner el estado de una propiedad a hipotecado y cambiarla
	 * del propietario al banco
	 */
	public void hipotecar(){

	}

	/**
	 * 
	 * @param idJugador
	 */
	public boolean registrarJugadorEnSubasta(int idJugador){
		return false;
	}

	/**
	 * Metodo encargado de vender una propiedad a un determinado jugador, haciendo un
	 * cambio en el estado de determinada propiedad dado su identificador
	 * 
	 * @param idPropi
	 */
	public void venderPropiedad(int idPropi){

	}

	/**
	 * Metodo encargado de vender un trago dado el tipo del trago y saignarselo a la
	 * propiedad a la que se le compra
	 * 
	 * @param tipoTrago
	 */
	public void venderTrago(String tipoTrago){

	}

}
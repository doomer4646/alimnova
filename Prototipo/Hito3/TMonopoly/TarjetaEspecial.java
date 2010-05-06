

/**
 * <b>Clase que representa las tarjetas especiales que se encuentran en algunas
 * casillas del tablero de juego</b>
 * @author hp
 * @version 1.0
 * @updated 05-may-2010 06:35:36 p.m.
 */
public class TarjetaEspecial {
	/**
	 * Almacena el tipo de la accion que realiza la tarjeta
	 */
	private String descripcion;
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
	
	
	public TarjetaEspecial(String descripcion, int idTarjeta, boolean libre) {
		super();
		this.descripcion = descripcion;
		this.idTarjeta = idTarjeta;
		this.libre = libre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	

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
	public void ejecutarLeyenda(String leyenda){

	}

}
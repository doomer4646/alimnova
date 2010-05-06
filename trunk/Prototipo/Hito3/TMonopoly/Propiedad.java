import java.util.ArrayList;
import java.util.List;



/**
 * <b>Clase que representa una propiedad dentro de la logica del juego</b>
 * @author hp
 * @version 1.0
 * @updated 05-may-2010 06:35:40 p.m.
 */
public class Propiedad {
	/**
	 * Almacena el identificador unico de la propiedad
	 */
	private int idPropiedad;
	public List<Trago> m_Trago;
	public EstadoPropiedad m_EstadoPropiedad;


	public Propiedad(int idPropiedad,
			EstadoPropiedad mEstadoPropiedad) {
		super();
		this.idPropiedad = idPropiedad;
		m_Trago = new ArrayList<Trago>();
		m_EstadoPropiedad = mEstadoPropiedad;
	}

	public int getIdPropiedad() {
		return idPropiedad;
	}

	public void setIdPropiedad(int idPropiedad) {
		this.idPropiedad = idPropiedad;
	}


	public List<Trago> getM_Trago() {
		return m_Trago;
	}

	public void setM_Trago(List<Trago> mTrago) {
		m_Trago = mTrago;
	}

	public EstadoPropiedad getM_EstadoPropiedad() {
		return m_EstadoPropiedad;
	}

	public void setM_EstadoPropiedad(EstadoPropiedad mEstadoPropiedad) {
		m_EstadoPropiedad = mEstadoPropiedad;
	}

	
	public Propiedad(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * <b>Maneja los estados de la propiedad (disponible, comprado, vendido)</b>
	 * 
	 * @param estado
	 */
	public void cambiarEstado(EstadoPropiedad estado){

	}

	/**
	 * Metodo encargado de calcular el costo del cover a pagar por la propiedad
	 */
	public int costoCover(){
		return 0;
	}

	/**
	 * Metodo encargado de verificar la disponibilidad(estado) de la propiedad.
	 *   - true: si la propiedad esta disponible
	 *   - false: si la propiedad no esta disponible
	 */
	public boolean verificarDisppropiedad(){
		return false;
	}

}
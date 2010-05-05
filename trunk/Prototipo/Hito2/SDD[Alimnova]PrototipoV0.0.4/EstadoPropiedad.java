

/**
 * <b>Clase que representa los estados que puede tener una propiedad</b>
 * @author hp
 * @version 1.0
 * @created 05-may-2010 04:56:02 p.m.
 */
public abstract class EstadoPropiedad {

	/**
	 * Almacena los diferentes valores que puede tener el cover de una propiedad segun
	 * lo que esta contenga
	 */
	private int cover[];
	/**
	 * Almacena el numero de tragos que tiene la propiedad
	 */
	private int numeroTragos;
	/**
	 * Almacena el precio de la cerveza para esa propiedad
	 */
	private int precioCerveza;
	/**
	 * Almacena el precio de compra para esa propiedad
	 */
	private int precioCompra;
	/**
	 * Almacena el precio de la hipoteca para la propiedad
	 */
	private int precioHipoteca;
	/**
	 * Almacena el precio de un wisky para la propiedad
	 */
	private int precioWisky;
	public Estados m_Estados;

	public EstadoPropiedad(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Metodo que retorna el precio del cover de una propiedad dependiendo del estado
	 * en que esta se encuentre
	 */
	public int costoCover(){
		return 0;
	}

}
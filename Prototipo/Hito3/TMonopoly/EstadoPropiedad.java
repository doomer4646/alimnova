

/**
 * <b>Clase que representa los estados que puede tener una propiedad</b>
 * @author hp
 * @version 1.0
 * @updated 05-may-2010 06:35:43 p.m.
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
	

	public EstadoPropiedad(int[] cover, int numeroTragos, int precioCerveza,
			int precioCompra, int precioHipoteca, int precioWisky,
			Estados mEstados) {
		super();
		this.cover = cover;
		this.numeroTragos = numeroTragos;
		this.precioCerveza = precioCerveza;
		this.precioCompra = precioCompra;
		this.precioHipoteca = precioHipoteca;
		this.precioWisky = precioWisky;
		m_Estados = mEstados;
	}

	public int[] getCover() {
		return cover;
	}

	public void setCover(int[] cover) {
		this.cover = cover;
	}

	public int getNumeroTragos() {
		return numeroTragos;
	}

	public void setNumeroTragos(int numeroTragos) {
		this.numeroTragos = numeroTragos;
	}

	public int getPrecioCerveza() {
		return precioCerveza;
	}

	public void setPrecioCerveza(int precioCerveza) {
		this.precioCerveza = precioCerveza;
	}

	public int getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(int precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getPrecioHipoteca() {
		return precioHipoteca;
	}

	public void setPrecioHipoteca(int precioHipoteca) {
		this.precioHipoteca = precioHipoteca;
	}

	public int getPrecioWisky() {
		return precioWisky;
	}

	public void setPrecioWisky(int precioWisky) {
		this.precioWisky = precioWisky;
	}

	public Estados getM_Estados() {
		return m_Estados;
	}

	public void setM_Estados(Estados mEstados) {
		m_Estados = mEstados;
	}

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


/**
 * <b>Clase que representa un servicio en la logica del juego</b>
 * @author hp
 * @version 1.0
 * @updated 05-may-2010 06:35:41 p.m.
 */
public class Servicio extends Especial {

	private String tipo;
	
	public Servicio(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Servicio(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}
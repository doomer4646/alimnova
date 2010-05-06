

/**
 * <b>Clase encargada de almacenar los datos de un jugador a lo largo de los
 * juegos en los que este participe</b>
 * @author hp
 * @version 1.0
 * @updated 05-may-2010 06:35:37 p.m.
 */
public class Perfil {

	/**
	 * Almacena el nombre de un jugador 
	 */
	private String nombre;
	/**
	 * Almacena el numero de partidas ganadas de un jugador con el mismo perfil
	 */
	private int partGanadas;
	/**
	 * Almacena el numero de partidas ganadas de un jugador desde la creacion del
	 * perfil
	 */
	private int partJugadas;
	/**
	 * Almacena el numero de las partidas perdidas de un jugador desde la creacion del
	 * ese perfil, este se calcula con la diferencia entre partidas jugadas y partidas
	 * ganadas
	 */
	private int partPerdidas;
	
	
	public Perfil(String nombre, int partGanadas, int partJugadas,
			int partPerdidas, String password) {
		super();
		this.nombre = nombre;
		this.partGanadas = partGanadas;
		this.partJugadas = partJugadas;
		this.partPerdidas = partPerdidas;
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPartGanadas() {
		return partGanadas;
	}

	public void setPartGanadas(int partGanadas) {
		this.partGanadas = partGanadas;
	}

	public int getPartJugadas() {
		return partJugadas;
	}

	public void setPartJugadas(int partJugadas) {
		this.partJugadas = partJugadas;
	}

	public int getPartPerdidas() {
		return partPerdidas;
	}

	public void setPartPerdidas(int partPerdidas) {
		this.partPerdidas = partPerdidas;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Almacena la clave de un jugador para poder ingresar a ese perfil
	 */
	private String password;

	public Perfil(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Metodo encargado de cambiar la clave de ingreso a un perfil por parte del
	 * jugador.
	 *   - true: si la clave se cambio con exito
	 *   - false: si la clave no se cambio con exito
	 * 
	 * @param nvaClave
	 */
	public boolean cambiarPassword(int nvaClave){
		return false;
	}

}
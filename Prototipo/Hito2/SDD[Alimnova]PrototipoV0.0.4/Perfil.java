

/**
 * <b>Clase encargada de almacenar los datos de un jugador a lo largo de los
 * juegos en los que este participe</b>
 * @author hp
 * @version 1.0
 * @created 05-may-2010 04:56:12 p.m.
 */
public class Perfil {

	/**
	 * Almacena el nombre de un jugador 
	 */
	private string nombre;
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
	/**
	 * Almacena la clave de un jugador para poder ingresar a ese perfil
	 */
	private string password;
	public Ranking m_Ranking;

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
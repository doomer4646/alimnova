import java.util.ArrayList;
import java.util.List;



/**
 * <b>Clase encargada de representar el ranking de jugadores registrados en el
 * juego</b>
 * @author Alimnova
 * @version 1.0
 * @updated 05-may-2010 06:35:37 p.m.
 */
public class Ranking {

	/**
	 * Almacena el identificador unico del ranking
	 */
	private int idRanking;
	private List<Perfil> perfiles;

	public Ranking(int idRanking) {
		super();
		this.idRanking = idRanking;
		this.perfiles = new ArrayList<Perfil>();
	}

	public int getIdRanking() {
		return idRanking;
	}

	public void setIdRanking(int idRanking) {
		this.idRanking = idRanking;
	}

	public List<Perfil> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}

	public Ranking(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Metodo encargado de actualizar el ranking dado un perfil
	 * 
	 * @param perf
	 */
	public static boolean actualizarRank(Perfil perf){
		return false;
	}

	/**
	 * Metodo encargado guardar en disco un ranking
	 */
	public static void guardarRank(){

	}

}
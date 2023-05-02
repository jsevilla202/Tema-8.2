package ejercicio1;
/**
 * Interfaz para comparar
 * @author Jaime Sevilla
 *
 */
public interface Comparable {
	/**
	 * Compara un objeto con otro
	 * @param obj Objeto introducido
	 * @return Devuelve 1, -1 o 0 dependiendo si es mayor, menor o igual
	 */
	int compareTo(Socio obj);
}

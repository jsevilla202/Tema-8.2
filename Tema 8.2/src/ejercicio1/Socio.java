package ejercicio1;
/**
 * Clase del Socio
 * @author Jaime Sevilla
 *
 */
public class Socio implements Comparable{
	/**
	 * ID del socio
	 */
	private int id;
	/**
	 * Nombre del socio
	 */
	private String nombre;
	/**
	 * Edad del socio
	 */
	private int edad;
	/**
	 * Constructor por defecto
	 * @param id Id dado por el usuario
	 * @param nombre Nombre dado por el usuario
	 * @param edad Edad dada por el usuario
	 */
	public Socio(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nombre=" + nombre + ", edad=" + edad;
	}
	@Override
	public int compareTo(Socio obv) {
		int respuesta = 0;
		if(this.id > obv.id) {
			respuesta = 1;
		}
		else if(this.id < obv.id) {
			respuesta = -1;
		}
		return respuesta;
	}
}

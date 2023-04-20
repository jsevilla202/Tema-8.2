package ejercicio1;

public class Socio implements Comparable{
	private int id;
	private String nombre;
	private int edad;
	
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

package ejercicio2;

public class Futbolista implements Comparable {
	private int numCamiseta;
	private String nombre;
	private int edad;
	private int numGoles;

	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		super();
		this.numCamiseta = numCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}

	@Override
	public String toString() {
		return "numCamiseta=" + numCamiseta + ", nombre=" + nombre + ", edad=" + edad + ", numGoles=" + numGoles;
	}

	public boolean equals(Futbolista obj) {
		boolean iguales = false;
		if (this.numCamiseta == obj.numCamiseta && this.nombre.equals(obj.nombre)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	public int compareTo(Futbolista obj) {
		int respuesta = 0;
		if (this.numCamiseta > obj.numCamiseta) {
			respuesta = 1;
		} else if (this.numCamiseta < obj.numCamiseta) {
			respuesta = -1;
		} else {
			if (this.nombre.equals(obj.nombre)) {
				respuesta = 0;
			} else {
				respuesta = this.nombre.compareTo(obj.nombre);
			}
		}
		return respuesta;
	}

}

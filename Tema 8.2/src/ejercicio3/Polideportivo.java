package ejercicio3;

public class Polideportivo implements InstalacionDeportiva, Edificio{
	private double superficie;
	private String nombre;
	
	public Polideportivo(double superficie, String nombre) {
		super();
		this.superficie = superficie;
		this.nombre = nombre;
	}
	@Override
	public int getTipoDeInstalacion() {
		int tipo = 0;
		switch(nombre) {
		case "futbol"-> tipo = 1;
		case "tenis" -> tipo = 2;
		case "padel" -> tipo = 3;
		case "baloncesto" -> tipo = 4;
		default-> tipo = 0;
		}
		return tipo;
	}
	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}
	
	

}

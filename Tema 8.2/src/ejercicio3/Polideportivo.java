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
		
	}
	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}
	
	

}

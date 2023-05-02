package ejercicio3;

public class EdificioOficinas implements Edificio{
	private int numoficinas;
	private double superficie;
	
	public int getNumoficinas() {
		return numoficinas;
	}

	public EdificioOficinas(int numoficinas, double superficie) {
		super();
		this.numoficinas = numoficinas;
		this.superficie = superficie;
	}
	
	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}
}

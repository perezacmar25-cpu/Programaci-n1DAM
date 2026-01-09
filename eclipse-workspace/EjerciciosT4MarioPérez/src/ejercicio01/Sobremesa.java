package ejercicio01;

public class Sobremesa extends Ordenador{
	
	private double precioMontaje;

	public Sobremesa(double discoDuro, double frecuenciaP, double precioBase, String marca, double precioMontaje) {
		super(discoDuro, frecuenciaP, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return "Sobremesa [precioMontaje=" + precioMontaje + "]";
	}
	
	
	
	

}

package ejercicio04;

public class Electronica extends Producto{
	
	private double impuestoExtra;

	public Electronica(double precioUnitario, String nombre, int id, double impuestoExtra) {
		super(precioUnitario, nombre, id);
		this.impuestoExtra = impuestoExtra;
	}

	public double getImpuestoExtra() {
		return impuestoExtra;
	}

	public void setImpuestoExtra(double impuestoExtra) {
		this.impuestoExtra = impuestoExtra;
	}

	@Override
	public String toString() {
		return "Electronica [impuestoExtra=" + impuestoExtra + "]";
	}


	
	
	
	
	
	

}

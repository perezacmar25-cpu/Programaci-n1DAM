package ejercicio03;

public class Furgoneta extends Vehiculo{
	
	
	private double precioFijo;

	public Furgoneta(int tipo, double impuestoBase, double precioFijo) {
		super(tipo, impuestoBase);
		this.precioFijo = precioFijo;
	}
	
	
	public double calcularImpuesto() {
		
		double total;
		
		total=super.calcularImpuesto()+precioFijo;
		
		return total;
		
	}
	
	
	
	

}

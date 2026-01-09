package ejercicio03;

public class Coche extends Vehiculo{
	
	private double potencia;

	public Coche(int tipo, double impuestoBase, double potencia) {
		super(tipo, impuestoBase);
		this.potencia = potencia;
	}
	
	
	public double calcularImpuesto() {
		
		double total;
		double calculoPotencia;
		double cien = 100;
		calculoPotencia= potencia*25/cien;
		
		total= super.calcularImpuesto()+calculoPotencia;
		
		return total;
		
		
	}
	

}

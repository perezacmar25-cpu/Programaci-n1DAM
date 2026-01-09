package ejercicio03;

public class Moto extends Vehiculo{
	
	private double cilindrada;

	public Moto(int tipo, double impuestoBase, double cilindrada) {
		super(tipo, impuestoBase);
		this.cilindrada = cilindrada;
	}
	
	public double calcularImpuesto() {
		
		double total;
		
		double cien=100;
		
		double sesenta =60;
		
		double calculoCilindrada = cilindrada*sesenta/cien;
		
		total= super.calcularImpuesto()+calculoCilindrada;
		
		return total;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}

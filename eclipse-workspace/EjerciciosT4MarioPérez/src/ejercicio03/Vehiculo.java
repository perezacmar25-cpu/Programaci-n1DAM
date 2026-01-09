package ejercicio03;

public class Vehiculo {
	
	private int tipo;
	private double impuestoBase;
	public Vehiculo(int tipo, double impuestoBase) {
		super();
		this.tipo = tipo;
		this.impuestoBase = impuestoBase;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getImpuestoBase() {
		return impuestoBase;
	}
	public void setImpuestoBase(double impuestoBase) {
		this.impuestoBase = impuestoBase;
	}
	@Override
	public String toString() {
		return "Vehiculo [tipo=" + tipo + ", impuestoBase=" + impuestoBase + "]";
	}
	
	public double calcularImpuesto() {
		
		double total;
		
		total= impuestoBase;
		
		return total;
		
	}
	
	
	
	
	
	

}



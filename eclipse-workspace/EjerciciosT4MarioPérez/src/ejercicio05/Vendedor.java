package ejercicio05;

public class Vendedor extends Empleado{
	
	private int cantidadVentas;
	private double incentivo;
	
	public Vendedor(String nombre, int id, double sueldoBase, int cantidadVentas, double incentivo) {
		super(nombre, id, sueldoBase);
		this.cantidadVentas = cantidadVentas;
		this.incentivo = incentivo;
	}
	public int getCantidadVentas() {
		return cantidadVentas;
	}
	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}
	public double getIncentivo() {
		return incentivo;
	}
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	@Override
	public String toString() {
		return "Vendedor [cantidadVentas=" + cantidadVentas + ", incentivo=" + incentivo + "]";
	}
	

	
	
		
	public double calcularSueldo() {
		
		return super.calcularSueldo()-incentivo;
		
		
		
	}
	
	
	
	
	
	
	
	

}

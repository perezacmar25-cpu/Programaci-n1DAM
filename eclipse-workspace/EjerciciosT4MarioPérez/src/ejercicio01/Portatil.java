package ejercicio01;

public class Portatil extends Ordenador {
	private boolean seguro;
	private double precioSeguro;
	public Portatil(double discoDuro, double frecuenciaP, double precioBase, String marca, boolean seguro,
			double precioSeguro) {
		super(discoDuro, frecuenciaP, precioBase, marca);
		this.seguro = seguro;
		this.precioSeguro = precioSeguro;
		
		
		
	}
	public boolean isSeguro() {
		return seguro;
	}
	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}
	public double getPrecioSeguro() {
		return precioSeguro;
	}
	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}
	@Override
	public String toString() {
		return "Portatil [seguro=" + seguro + ", precioSeguro=" + precioSeguro + "]";
	}
	
	
	
	
	
	
	
	
	
	

}

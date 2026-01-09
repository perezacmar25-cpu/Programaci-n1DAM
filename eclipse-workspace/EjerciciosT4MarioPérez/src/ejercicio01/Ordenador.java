package ejercicio01;

public class Ordenador {
	
	private double discoDuro;
	private double frecuenciaP;
	private double precioBase;
	private String marca;
	public Ordenador(double discoDuro, double frecuenciaP, double precioBase, String marca) {
		super();
		this.discoDuro = discoDuro;
		this.frecuenciaP = frecuenciaP;
		this.precioBase = precioBase;
		this.marca = marca;
	}
	public double getDiscoDuro() {
		return discoDuro;
	}
	public void setDiscoDuro(double discoDuro) {
		this.discoDuro = discoDuro;
	}
	public double getFrecuenciaP() {
		return frecuenciaP;
	}
	public void setFrecuenciaP(double frecuenciaP) {
		this.frecuenciaP = frecuenciaP;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Ordenador [discoDuro=" + discoDuro + ", frecuenciaP=" + frecuenciaP + ", precioBase=" + precioBase
				+ ", marca=" + marca + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

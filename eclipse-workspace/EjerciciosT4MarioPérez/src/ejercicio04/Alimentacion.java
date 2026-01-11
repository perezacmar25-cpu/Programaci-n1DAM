package ejercicio04;

public class Alimentacion extends Producto {

	
	private double descuento;

	public Alimentacion(double precioUnitario, String nombre, int id, double descuento) {
		super(precioUnitario, nombre, id);
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Alimentacion [descuento=" + descuento + "]";
	}

	public double calcularPrecio(int cant) {
		
		double cien=100.0;
		double precio= super.calcularPrecio(cant)-(super.calcularPrecio(cant)*descuento)/cien;
		return precio;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

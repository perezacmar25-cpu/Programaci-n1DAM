package ejemploobjetoparametro;

public class Producto {
	
	private String nombre;
	private boolean refrigerado;
	private double precioBase;
	
	public Producto(String nombre, boolean refrigerado, double precioBase) {
		
		this.nombre = nombre;
		this.refrigerado = refrigerado;
		this.precioBase = precioBase;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	
	public String toString() {
		return "\nProducto [nombre=" + nombre + ", refrigerado=" + refrigerado + ", precioBase=" + precioBase + "€]";
	}
	//Suma al precio base un porcentaje si es refrigerado
	
	public double calcularPVP (double porcentaje) {
		double total=0.0;
		double cien=100;
		double por;
		
		por=precioBase*porcentaje/cien;
		if(refrigerado) {
			total=precioBase+por;
		}else {
			total=precioBase;
		}
		return total;
		
		
		
	}
	
	
	
	
	
	
	
	
}

package ejemploestatico;

public class Producto {
	private String nombre;
	private double precioBase;
	private static int contador;
	public Producto(String nombre, double precioBase) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		contador++;
		
	}
	
public double calcularPrecio(double ganancia) {
	
	double cien= 100.0;
	return precioBase+precioBase*ganancia/cien;
}

@Override
public String toString() {
	return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", Contador="+contador+ "]";
}












}

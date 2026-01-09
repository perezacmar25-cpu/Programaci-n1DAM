package ejemploestatico;

public class Gestion {
	
	private static double caja;
	
	public double calcularLineaVenta(double ganancia,int cantidad,Producto p) {
		double total;
		total=p.calcularPrecio(ganancia)*cantidad;
		caja+=total;
		return total;
		
		
		
		
	}

public double sumarCaja(double ganancia,int cantidad,Producto p) {
	
	caja=calcularLineaVenta(ganancia,cantidad,p);
	return caja;
	
	
}
	

}

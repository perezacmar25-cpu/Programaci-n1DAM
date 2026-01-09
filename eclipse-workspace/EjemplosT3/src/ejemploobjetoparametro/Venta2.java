package ejemploobjetoparametro;

public class Venta2 {

	private String nombreVendedor;
	private double totalVenta;
	public Venta2(String nombreVendedor, double totalVenta) {
		
		this.nombreVendedor = nombreVendedor;
		this.totalVenta = totalVenta;
		
	}
	
	public double calcularVenta2(double [] listaImpuestos) {
		
		double suma=0.0;
		
	for(int i=0;i<listaImpuestos.length;i++) {
			
			suma=suma+listaImpuestos[i];
			
		}
		return suma/listaImpuestos.length;
		
		
		
	}
	
	
	
	
	
	
}

package ejemploobjetoparametro;

public class Venta {

	private double totalVenta;
	private String nombreVendedor;
	private double [] listaImpuestos;
	public Venta(double totalVenta, String nombreVendedor, double[] listaImpuestos) {
		
		this.totalVenta = totalVenta;
		this.nombreVendedor = nombreVendedor;
		this.listaImpuestos = listaImpuestos;
	}
	public double getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	public double[] getListaImpuestos() {
		return listaImpuestos;
	}
	public void setListaImpuestos(double[] listaImpuestos) {
		this.listaImpuestos = listaImpuestos;
	}
	
	
	public double calcularMediaImpuestos() {
		
		double suma=0.0;
		
		for(int i=0;i<listaImpuestos.length;i++) {
			
			suma=suma+listaImpuestos[i];
			
		}
		return suma/listaImpuestos.length;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

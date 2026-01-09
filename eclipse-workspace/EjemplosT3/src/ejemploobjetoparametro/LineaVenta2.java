package ejemploobjetoparametro;

public class LineaVenta2 {
	
	//No es atributo(Producto p)
	private int cantidad;
	private double subTotal;
	public LineaVenta2(int cantidad, double subTotal) {
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getSubTotal() {
		return subTotal;
	}
	
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public String toString() {
		return "LineaVenta2 [cantidad=" + cantidad + ", subTotal=" + subTotal + "]";
	}
	
	public double calcularSubTotal2(double porcentaje, Producto p) {
		
		subTotal=cantidad*p.calcularPVP(porcentaje);
		return subTotal;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

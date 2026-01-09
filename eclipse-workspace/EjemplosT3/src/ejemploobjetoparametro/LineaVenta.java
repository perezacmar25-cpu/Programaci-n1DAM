package ejemploobjetoparametro;

public class LineaVenta {
	
	
	private Producto p;
	private int cantidad;
	private double subTotal;
	
	public LineaVenta(Producto p, int cantidad, double subTotal) {
		this.p = p;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}
	
	public LineaVenta(Producto p, int cantidad) {
		
		this.p = p;
		this.cantidad = cantidad;
	}

	public Producto getP() {
		return p;
	}
	public void setP(Producto p) {
		this.p = p;
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
		
		return "LineaVenta [p=" + p + ", cantidad=" + cantidad + ", subTotal=" + subTotal + "]";
		
	}
	
	public double calcularSubtotal(double porcentaje) {
		double subTotal;
		subTotal=cantidad*p.calcularPVP(porcentaje);
		return subTotal;
		
		
		
		
	}
	
	
	
	
	
	
	

}

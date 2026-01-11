	package ejercicio04;

public class LineaDeVenta {
	
	private Producto p;	
	private int cant;
	
	
	
	public LineaDeVenta(Producto p, int cant) {
		super();
		this.p = p;
		this.cant = cant;
	}
	
	public Producto getP() {
		return p;
	}
	public void setP(Producto p) {
		this.p = p;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	
	@Override
	public String toString() {
		return "LineaDeVenta [p=" + p + ", cant=" + cant + "]";
	}
	
		
	
	
	
	
	
	
	
	
	
	

}

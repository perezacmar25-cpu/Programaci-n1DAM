package ejercicio09;

public class Sorteo {

	private int desde;
	private int hasta;
	
	
	public Sorteo(int desde, int hasta) {
		this.desde = desde;
		this.hasta = hasta;
		
	}
	
	public double comprarDecimo (int numCupones) {
		
		double precioTotal;
		double precio=20;
		precioTotal=numCupones*precio;
		return precioTotal;
		
	}
	
	public double devolucion(int numCupones,double pagar) {
		
		double precio=20, devolucion;
		double precioTotal;
		precioTotal=numCupones*precio;
		devolucion=precioTotal-pagar;
		return devolucion;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

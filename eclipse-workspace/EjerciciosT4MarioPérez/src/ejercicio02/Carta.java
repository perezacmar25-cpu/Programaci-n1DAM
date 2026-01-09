package ejercicio02;

public class Carta extends Documento {
	
	private String fecha;

	public Carta(String salesianos, String colegio, String fecha) {
		super(salesianos, colegio);
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return super.toString()+ "Carta [fecha=" + fecha + "]";
	}
	
	
	
	
	
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void imprimirDoc() {
		
		super.imprimirDoc();
		System.out.println("\t\t\t\t"+fecha);
		
		
		
		
	}

}

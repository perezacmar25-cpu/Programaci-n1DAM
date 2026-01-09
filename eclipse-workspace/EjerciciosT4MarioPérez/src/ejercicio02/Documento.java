package ejercicio02;

public class Documento {
	
	private String salesianos;
	private String colegio;
	public Documento(String salesianos, String colegio) {
		super();
		this.salesianos = salesianos;
		this.colegio = colegio;
	}
	
	
	
	public String getSalesianos() {
		return salesianos;
	}



	public void setSalesianos(String salesianos) {
		this.salesianos = salesianos;
	}



	public String getColegio() {
		return colegio;
	}



	public void setColegio(String colegio) {
		this.colegio = colegio;
	}



	@Override
	public String toString() {
		return "Documento [salesianos=" + salesianos + ", colegio=" + colegio + "]";
	}
	
	
	
	public void imprimirDoc() {
		
		System.out.println(salesianos+"\t\t\t"+colegio+"\n\n\n");
		
		
		
	}
	
	
	
	
	

}

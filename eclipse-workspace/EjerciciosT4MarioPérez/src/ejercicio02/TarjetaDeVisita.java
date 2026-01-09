package ejercicio02;

public class TarjetaDeVisita extends Documento {
	
	private String autor;

	public TarjetaDeVisita(String salesianos, String colegio, String autor) {
		super(salesianos, colegio);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return super.toString()+ "TarjetaDeVisita [autor=" + autor + "]";
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public void imprimirDoc() {
		
		super.imprimirDoc();
		System.out.println("\t\t\t\t"+autor);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}

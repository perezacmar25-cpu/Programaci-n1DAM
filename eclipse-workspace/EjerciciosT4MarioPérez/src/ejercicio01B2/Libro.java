package ejercicio01B2;

public class Libro extends Publicacion implements IGestion {

	public Libro(int id, String nombre, boolean prestado,int fecha) {
		super(id, nombre,prestado,fecha);
	}

	
	
	public int cuentaPrestados(Publicacion[] lista) {
		int cont=0;
		
		
		for(int i=0;i<lista.length;i++) {
			
			if(lista[i]!=null && lista[i].isPrestado()) {
				
				cont++;
				
				
				
			}
			
			
		}
		
		return cont;
	}
	
	
	
	public int publicacionesAnterioresA(Publicacion [] lista, int annyo) {
		
		int cont=0;
		
		for(int i=0;i<lista.length;i++) {
			
			if(lista[i]!=null && lista[i].getFecha()<annyo) {
				cont++;
				
				
			}
			
			
		}
		
		return cont;
		
		
		
		
	}
	
	
	
	

}

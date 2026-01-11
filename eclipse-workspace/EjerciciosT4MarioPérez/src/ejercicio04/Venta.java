package ejercicio04;

import java.util.Arrays;

public abstract class  Venta {
	
	private LineaDeVenta[] lista;
	
	

	public Venta(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}

	public LineaDeVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaDeVenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

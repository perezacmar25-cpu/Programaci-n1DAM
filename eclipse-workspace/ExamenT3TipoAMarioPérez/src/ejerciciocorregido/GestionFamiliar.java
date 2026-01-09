package ejerciciocorregido;

import java.util.Arrays;

public class GestionFamiliar {
	
	private Hijo [] lista;
	private double presupuesto;
	public GestionFamiliar(Hijo[] lista, double presupuesto) {
	
		this.lista = lista;
		this.presupuesto = presupuesto;
	}
	
	
	public GestionFamiliar(Hijo[] lista) {
	
		this.lista = lista;
	}


	public Hijo[] getLista() {
		return lista;
	}
	public void setLista(Hijo[] lista) {
		this.lista = lista;
	}
	public double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	@Override
	public String toString() {
		return "GestionFamiliar [lista=" + Arrays.toString(lista) + ", presupuesto=" + presupuesto + "]";
	}
	
	
	
	
	
	
	
	
	

}

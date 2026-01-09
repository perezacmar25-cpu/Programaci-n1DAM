package ejercicio;

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
		return "GestionFamiliar [lista=" + Arrays.toString(lista) + ", presupuesto=" + presupuesto + "€]";
	}
	
	public Hijo findById(int idBuscada) {
		for(int i=0;lista[i]==null;i++) {
			
			if(idBuscada==lista[i].getId()) {
				
				return lista[i];
				
				
			}
		
	}
				return null;	
	}
	
	
	public Hijo buscarMenorCatorce() {
		int i=0;
		int catorce=14;
		
		while(lista[i]!=null) {
		for(i=0;i<lista.length;i++) {
			if(lista[i].getEdad()<catorce) {
				return lista[i];
				
			}
		}
			
		}
				return null;
	}
	
	public double calcularPagaCatorce(double paga) {
		int catorce=14;
		double pagaTotal=0;
		
		
		
		for(int i=0;lista[i]==null;i++) {
			
			if(lista[i].getEdad()>catorce) {
				
				pagaTotal+=paga;
				
				
			}else {
				pagaTotal=0;
			}
			
			
		}
		return pagaTotal;
		
		
		
	}
	
	
	public double calcularPresupuesto(double presupuesto,double paga,double por,int cont) {
		double presupuestoRestante=0;
		
		for(int i=0;lista[i]==null;i++) {
			
			presupuestoRestante=presupuesto-(lista[i].calcularPaga(paga, por)*cont);
			
		}
		
		return presupuestoRestante;
		
		
		
	}
	
	public double calcularPorcentaje(int num,double paga, double por) {
		double porcentajeTotal;
		int cien=100;
		porcentajeTotal=lista[num].calcularPaga(paga, por)*cien/presupuesto;
		return porcentajeTotal;
		
		
		
	}
	
	public void imprimirMensaje(double paga) {
		int diez=10;
		
		if(paga>=diez) {
			System.out.println("Ángel, menos mal que por lo menos tengo para comprarme fresas de chuche, algo es algo\n");
		}else {
			System.out.println("Ángel, no tengo ni para pipas, ayúdame por favor");
		}
		
		
		
		
		
	}
	
	public void imprimirHijos() {
		for(int i=0;lista[i]==null;i++) {
		System.out.println(lista[i]);
		}
	}
	
	
	
	

}

package ejercicio;

import java.util.Arrays;

public class Administracion {

	private Profesor[] lista;
	private double presupuestoTotal;
	
	
	public Administracion(Profesor[] lista, double presupuestoTotal) {

		this.lista = lista;
		this.presupuestoTotal = presupuestoTotal;
	}
	
	
	
	
	
	
	
	public Administracion(Profesor[] lista) {

		this.lista = lista;
	}
	
	







	public Administracion(double presupuestoTotal) {
	
		this.presupuestoTotal = presupuestoTotal;
	}







	public Profesor[] getLista() {
		return lista;
	}
	public void setLista(Profesor[] lista) {
		this.lista = lista;
	}
	public double getPresupuestoTotal() {
		return presupuestoTotal;
	}
	public void setPresupuestoTotal(double presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}
	@Override
	public String toString() {
		return "Administracion [lista=" + Arrays.toString(lista) + ", presupuestoTotal=" + presupuestoTotal + "]";
	}
	
	public void agregar(int cont, Profesor p) {
		
		
		lista[cont]=p;
		
		
		
	}
	
	public Profesor findById(int id) {
		int i=0;
	
			for(i=0; i<lista.length;i++) {
				
				if(lista[i].getId()==id) {
					
					return lista[i];
				
				}	
			}
		
		return null;
		
	}
	
	public Profesor[] buscarByAntiguedad() {
				int i=0;
				int j=0;
				Profesor listaP[];
				listaP=new Profesor[lista.length];
			
					for(i=0;i<lista.length;i++) {
						if(lista[i].getAntiguedad()==lista[i].getAntiguedad()) {
							listaP[j]=lista[i];
							j++;
							return listaP;
							
						}
					
					}
					
					
				
		
							return null;
		
	}
	
	
	
	public double calcularDineroVeinte(double pagaHora, double por) {
		int i=0, veinte=20;
		double precioTotal=0;
		
		
			for(i=0;i<lista.length;i++) {
				
				if(lista[i].getAntiguedad()>veinte) {
					precioTotal+=lista[i].calcularSueldo(pagaHora, por);
					return precioTotal;
					
				}
				
			}
			
		
		
		return precioTotal;
		
		
	}
	
	
	public void comprobarSueldo(double pagaHora, double porcentaje,int num) {
		int milDoscientos=1200;
		
		
		
			if(lista[num-1].calcularSueldo(pagaHora, porcentaje)>milDoscientos) {
				System.out.println("Este mes comemos jamón");
				
				
			}else {
				System.out.println("Este mes comemos chopped");
			}
			
			
		}
		
	
	
	public void modificarHorasTrabajadas(int id,int horas2) {
		
		findById(id).setHorasMes(horas2);
		
		
		
	}
	
	public double calcularPresupuestoRestante(double presupuesto,double pagaHora, double por) {
		
		double presupuestoRestante=0;
		for(int i=0;i<lista.length;i++) {
		
			presupuestoRestante=presupuesto-lista[i].calcularSueldo(pagaHora, por);
		
		}
		
		return presupuestoRestante;
	}
	
	
	
	public double calcularPorcentajePresupuesto(int id3,double pagaHora, double por) {
		double porcentajeTotal;
		int cien=100;
		
		porcentajeTotal=findById(id3).calcularSueldo(pagaHora, por)*cien/presupuestoTotal;
		
		return porcentajeTotal;

		
		
	}
	
	
	
	
	
	
	
	
	
	
}

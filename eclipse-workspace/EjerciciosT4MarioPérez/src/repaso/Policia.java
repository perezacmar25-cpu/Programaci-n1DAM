package repaso;

public class Policia extends Empleado implements IGestion {
	
	
	public void calcularSueldo() {
		
		super.imprimir();
		
		super.calcularSueldo();  System.out.println("Joder");
		
	}
	
	public void imprimirCagar() {
		
		
		System.out.println("Me cago tela");
	}

}

package repaso;
import utilidades.Leer;
public class Main {

	public static void main(String[] args) {
		
		Empleado e1=new Profesor();
		Empleado e2 =new Policia();
		IGestion e3 = new Empleado();
		IGestion e4 = new Policia();
		
		
		e1.calcularSueldo();
		e2.calcularSueldo();
		
		
		
		e3.calcularSueldo();
		e4.imprimirCagar();
		

	}

}

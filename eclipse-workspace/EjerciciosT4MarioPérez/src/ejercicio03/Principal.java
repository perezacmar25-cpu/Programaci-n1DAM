package ejercicio03;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int op;
		double impuestoBase;
		double cilindrada=100.0;
		
		System.out.println("Diga el impuesto base");
		impuestoBase=Leer.datoDouble();
		System.out.println("¿Qué tipo de coche tiene?");
		
		System.out.println("Pulsa 1 si es moto");
		System.out.println("Pulsa 2 si es coche");
		System.out.println("Pulsa 3 si es furgoneta");
		op=Leer.datoInt();
		Vehiculo v1= new Vehiculo(op,impuestoBase);
		Moto m1= new Moto(op,impuestoBase,cilindrada);
		
		
		
		
		System.out.println(m1.calcularImpuesto());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package ejercicio14;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salarioSemanal;
		int horasSemanales;
		double sueldoHora=16;
		int horasExtra;
		
		System.out.println("¿Cuántas horas semanales trabaja");
		horasSemanales=Leer.datoInt();
		if(horasSemanales<40) {
			salarioSemanal=horasSemanales*sueldoHora;
			System.out.printf("Su sueldo sería: %.2f ",salarioSemanal+"€");
			
		}
		
		if(horasSemanales>=40) {
			System.out.println("¿Cuántas horas extra trabaja?");
			horasExtra=Leer.datoInt();
			salarioSemanal=horasSemanales*sueldoHora+(horasExtra*20);
			System.out.printf("Su sueldo sería: %.2f ",salarioSemanal,"€");
			
		}
		
		
		
		
		
	}

}

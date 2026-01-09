package ejercicio03;

public class Operaciones {
		
		
	
		public int numeroEntero(int numero) {
			
			int cero=0;
			
			if(numero<cero) {
				
				System.out.println("El número es negativo");
			}else {
				
				System.out.println("El número es positivo");
			}
			
			return numero;
		}
		
		public int numeroImparPar(int numero) {
			int dos=2;
			int cero=0;
			if(numero%2==cero) {
				System.out.println("El número es par");
				
			}else {
				System.out.println("El número es impar");
			}
			
			return numero;
		}
	

}

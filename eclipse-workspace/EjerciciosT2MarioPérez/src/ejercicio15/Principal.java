package ejercicio15;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		int tope=10;
		
		System.out.println("¿De qué número quieres la tabla de multiplicar?");
		numero=Leer.datoInt();
		
		
		for(int i=0;i<=tope;i++) {
			
		int resultado;
		resultado=numero*i;
		System.out.println(+resultado);
		}
		
		
		System.out.println("Gracias por usar el programa");
		
		
	}

}

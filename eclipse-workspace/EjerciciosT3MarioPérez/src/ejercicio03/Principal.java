package ejercicio03;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operaciones op;
		int total;                              
		int numero;
		int total2;
		
		op= new Operaciones();
		
		
		
		System.out.println("Di un número");
		numero=Leer.datoInt();
		total=op.numeroEntero(numero);
		total2=op.numeroImparPar(numero);
		
		
		
	}

}


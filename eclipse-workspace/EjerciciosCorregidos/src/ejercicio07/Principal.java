package ejercicio07;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Moneda m1;
		Juego m2;
		System.out.println("Pulsa 1 si quiere elegir cara");
		System.out.println("Pulsa 2 si quiere elegir cruz");
		op=Leer.datoInt();
		
		m1=new Moneda();
		
		m2=new Juego();
		m2.resultado(op);
		m2.imprimirResultado(op);
	}

}

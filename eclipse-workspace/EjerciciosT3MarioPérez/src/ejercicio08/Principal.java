package ejercicio08;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldo=0;
		CuentaCorriente cue;
		String nombre;
		CuentaCorriente cue2;
		double retirar;
		double ingresar;
		boolean comprobar;
		
		System.out.println("¿Cuánto dinero quiere ingresar?");
		saldo=Leer.datoDouble();
		System.out.println("¿Cómo se llama?");
		nombre=Leer.dato();

		cue=new CuentaCorriente(nombre);
		
		System.out.println("Ingreso");
		ingresar=Leer.datoDouble();
		cue.ingresar(ingresar);
		
		System.out.println("¿Cuánto dinero quiere retirar?");
		retirar=Leer.datoDouble();
		comprobar=cue.retirar(retirar);
		if(comprobar) {
			System.out.println("Retirada exitosa");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		
		
	}

}

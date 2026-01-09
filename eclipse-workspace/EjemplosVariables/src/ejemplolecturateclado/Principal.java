package ejemplolecturateclado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int edad;
		double precio;
		
		
		
		System.out.println("Introduzca su nombre");
		nombre=Leer.dato();
		System.out.println("Introduzca su edad");
		edad=Leer.datoInt();
		System.out.println("Su nombre es: "+nombre+" y su edad:"+edad);
		
		System.out.println("¿Cuánto vale el producto?");
		precio=Leer.datoDouble();
		
		System.out.printf("El precio es: %.2f €" ,+precio);
		
		
	}

}

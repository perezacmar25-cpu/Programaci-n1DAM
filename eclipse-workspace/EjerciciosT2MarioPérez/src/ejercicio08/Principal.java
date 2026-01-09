package ejercicio08;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String usuario;
		String contraseña;
		
		
		System.out.println("Para registrarse, tiene que introducir su usuario");
		System.out.println("Introduzca su usuario");
		usuario=Leer.dato();
		System.out.println("Introduzca su contraseña");
		contraseña=Leer.dato();
		
		System.out.println("Ahora, tiene que iniciar sesión");
		System.out.println("Introduzca su usuario");
		usuario=Leer.dato();
		System.out.println("Introduzca su contraseña");
		contraseña=Leer.dato();
		
		
	}

}

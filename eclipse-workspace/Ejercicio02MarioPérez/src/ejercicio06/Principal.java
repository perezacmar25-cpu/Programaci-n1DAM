package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sueldo;
		double horastrabajadaspormes;
		double cobrohora;
		double horasextra;
		double cobroextra;
		int veinte=20;
		double horasdiarias;
		
		System.out.println("Hola, bienvenido al programa. Este programa calcula el sueldo del trabajador");
		
		System.out.println("¿Cuántas horas diarias trabajas?");
		
		horasdiarias=Leer.datoDouble();
		
		horastrabajadaspormes=horasdiarias*veinte;
		
		System.out.println("Bien, ahora dime, ¿cuánto cobras por hora?");
		cobrohora=Leer.datoDouble();
		
		System.out.println("¿Cuántas horas extras echas?");
		horasextra=Leer.datoDouble();
		
		
		
		System.out.println("¿Cuánto cobras por hora extra?");
		
		cobroextra=Leer.datoDouble();
		
		
		sueldo=(horastrabajadaspormes*cobrohora)+(horasextra*cobroextra);
		
		System.out.println("Por lo tanto, su sueldo sería: "+ sueldo);
	}

}

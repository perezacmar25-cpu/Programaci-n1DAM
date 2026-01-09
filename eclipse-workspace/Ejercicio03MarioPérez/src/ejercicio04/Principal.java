package ejercicio04;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio;
		int cuatrotercios=4/3;
		double volumenesfera;
		double radio2;
		double altura;
		double volumen2;
		
		System.out.println("Bienvenido. Este programa calcula el volumen de una esfera según el radio que desee");
		System.out.println("Diga un radio:");
		radio=Leer.datoDouble();
		
		
		volumenesfera=cuatrotercios*Math.PI*Math.pow(radio,3);
		System.out.printf("Por lo tanto, el volumen de la esfera sería: %.2f\n ",volumenesfera);
		
		System.out.println("\nAhora, el volumen de un cilindro");
		System.out.println("\nDi el radio");
		radio2=Leer.datoDouble();
		
		System.out.println("Ahora di la altura");
		altura=Leer.datoDouble();
		
		volumen2=Math.PI*Math.pow(radio2,2)*altura;
		
		System.out.printf("El volumen del cilindro es: %.2f ",volumen2);
		
	}

}

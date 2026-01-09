package ejercicio08;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int radio=3;
		double área;
		double longitud;
		int diámetro=6;
		double radio2=5.2;
		
		System.out.println("Este programa calcula las dimensiones de circunferenias");
		
		
		longitud=Math.PI*diámetro;
		
		System.out.printf("La longitud de la primera circunferencia es: %.2f ",longitud);
		
		área=Math.PI*Math.pow(radio2,2);
		
		System.out.printf("El área de la segunda circunferencia es: %.2f ",área);
		
	}

}

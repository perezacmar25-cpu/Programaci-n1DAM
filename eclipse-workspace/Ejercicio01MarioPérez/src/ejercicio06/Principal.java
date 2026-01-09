package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio=50;
		double descuento=30;
		double cien=100;
		double precioreducido=precio*descuento/cien;
		double total=precio-precioreducido;
		
		System.out.println("Hola, bienvenidos a este programa. Este programa hace cáculos respecto al descuento de un producto.");
		System.out.println("El descuento es: "+precioreducido+" €");
		System.out.println("El total es: "+total+"€");
	}

}

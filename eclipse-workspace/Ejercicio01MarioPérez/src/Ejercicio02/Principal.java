package Ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bienvenido al programa, en este se calculará las dimensiones de varias piscinas");
		/*Si quiero poner el número PI, pongo Math.PI
		 * Si quiero poner algo elevado a algo, pongo Math.pow y entre paréntesis pongo lo que quiero elevar coma el número al que quiero elevarlo, ejemplo: Math.pow(radio, 2)
		 * 
		 */
		double lar=50;
		double anc=21;
		double pro=2.50;
		double resultado;
		double precioM3=1.80;
	
		resultado=pro*anc*lar;
		
		double PI= 3.14;
		double rad= 12;
		double alt= 1.80;
		double volumen;
		
		volumen= Math.PI*(rad*rad)*alt;
		
		System.out.println("El volumen de la segunda piscina es: " +volumen);
		System.out.println("El volumen de la primera piscina es: " +resultado);
		
		double precio1;
		precio1= resultado*precioM3;
		System.out.println("El precio de la primera piscina es: "+precio1);
		
		
	}

}

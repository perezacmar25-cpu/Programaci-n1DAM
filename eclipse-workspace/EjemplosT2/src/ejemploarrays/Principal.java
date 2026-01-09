package ejemploarrays;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//arriba se declara el array y abajose pone el tamaño que quieres
		int tam;
		int [] edades= {22,45,6,78,4};
		double [] precios;
		int [] edad;
		
		System.out.println("¿Cuántas edades va a guardar?");
		tam=Leer.datoInt();
		edades=new int [tam];
		System.out.println("Qué edad tienes");
		edades[0]=Leer.datoInt();
		
		for(int i=0;i<edades.length;i++) {
			System.out.println("Edad: "+edades[i]);
		}
		
	}

}

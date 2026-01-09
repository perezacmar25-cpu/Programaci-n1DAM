package ejemplooperaciones;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		int []edades;
		int numero;
		double suma=0;
		double media;
		
		System.out.print("¿Cuántas edades va a introducir?");
		tam=Leer.datoInt();
		
		edades=new int[tam];
		
		for(int i=0;i<edades.length;i++) {
			
			System.out.println("Diga una edad");
			edades[i]=Leer.datoInt();
			
		}
		
		for(int i=0;i<edades.length;i++) {
			
			System.out.println("Valor: "+edades[i]);
		}
		
		for(int i=0;i<edades.length;i++) {
			if(edades[i]==18) {
				
				edades[i]=0;
			}
		


		}

		System.out.println("¿Qué número quiere?");
		numero=Leer.datoInt();
		edades[numero]=Leer.datoInt();
		System.out.println("El elemento es: "+edades[numero-1]);
		
		
		
	
	//Sumar los elementos
	
		for(int i=0;i<edades.length;i++) {
			suma=suma+edades[i];
			System.out.println("La suma vale "+suma);
			media=suma/edades.length;
			System.out.println("La media es: "+media);
			
		}

}
}

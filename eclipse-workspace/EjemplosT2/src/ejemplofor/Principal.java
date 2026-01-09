package ejemplofor;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int veces;
		String frase;
		
		System.out.println("Cuántas veces quiere mostrar la frase");
		veces=Leer.datoInt();
		System.out.println("Qué frase quieres quillo");
		frase=Leer.dato();
		
		for(int i=0;i<veces;i++) {
			
			System.out.println((i+1)+" "+frase);
		}
		
		
		
		
	}

}

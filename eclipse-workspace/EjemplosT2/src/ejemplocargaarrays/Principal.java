package ejemplocargaarrays;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] listado;
		int tam;
		
		
		
		
		System.out.println("Diga tamaño");
		tam=Leer.datoInt();
		
		listado=new int [tam];
		
		//cargar array
		
		for(int i=0; i<listado.length;i++) {
			
			System.out.println("Diga un número");
			listado[i]=Leer.datoInt();
			
		}
			
		for(int i=0;i<listado.length;i++) {
			System.out.println("Valor: "+listado[i]);
			
			
			
		}
		
	}

}

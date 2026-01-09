package ejercicio06;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] meses;
		double[] precios;
		int tam;
		
		
		System.out.println("¿Cuántos pagos va a hacer?");
		tam=Leer.datoInt();
		precios=new double [tam];
		meses=new String[tam];
		
		for(int i=0;i<meses.length;i++) {
			
			System.out.println("Introduzca el nombre del pago");
			meses[i]=Leer.dato();
			System.out.println("Introduzca el pago");
			precios[i]=Leer.datoDouble();
		}
		
		for(int i=0;i<meses.length;i++) {
			
			System.out.println(""+meses[i]); 
			System.out.println(""+precios[i]);
		}
		
		
		
		
		
		//System.out.println(meses[0]+"\t\t\t\t"+meses[1]+"\t\t\t\t"+meses[2]);
		//System.out.println("\n\n"+precios[0]+"\t\t\t\t"+precios[1]+"\t\t\t\t"+precios[2]);
		
		
		//
		
		
		
		
	}

}

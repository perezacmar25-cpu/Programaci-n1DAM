package ejemplométodos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int total;
		int numero1 , numero2;
		int total2;
		int nume1, nume2;
		
		Operaciones op= new Operaciones();
		System.out.println("Di un número");
		numero1=Leer.datoInt();
		System.out.println("Di otro");
		numero2=Leer.datoInt();
		total=op.sumarDosEnteros(numero1, numero2);
		
		System.out.println("Di uno");
		nume1=Leer.datoInt();
		System.out.println("otro");
		nume2=Leer.datoInt();
		total2=op.dividirDosNúmeros(nume1, nume2);
		
		System.out.println(total);
		System.out.println(total2);
		
		
		
		
		
		
		
	}

}

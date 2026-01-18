package ejercicio01B2;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		int tam =5;
		int annyo;
		
		 Publicacion [] lista =new Publicacion[tam];
		 
		 Publicacion l1 =new Libro (1,"Mario",true,2000);
		
		 Publicacion r1 = new Revista (2,"ABC",true,1995);
		 
		 IGestion g1= new Libro (1,"Mario",true,2000);
		 
		 IGestion g2 = new Revista(2,"ABC",true,1995);
		
		 lista[0]=l1;
		 
		 lista[1]=r1;
		 
		 System.out.println(g1.cuentaPrestados(lista));
		 System.out.println(g2.cuentaPrestados(lista));
		 System.out.println("Di año");
		 annyo=Leer.datoInt();
		 System.out.println(g1.publicacionesAnterioresA(lista, annyo));
		 System.out.println(g2.publicacionesAnterioresA(lista, annyo));
		 
		 for (int i=0;i<lista.length && lista[i]!=null;i++) {
			 
			 System.out.println(lista[i]);
		 }
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package ejercicio01;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1;
		double num2;
		
		
		
		System.out.println("Hola, diga un número");
		num1=Leer.datoDouble();
		
		
		System.out.println("Di otro");
		num2=Leer.datoDouble();
		
		
		if(num1>num2)	{
			System.out.printf("Entonces:%.2f>%.2f ",num1,num2);
		}else {
			System.out.printf("Entonces: %.2f<%.2f ",num1,num2);
		}
		}
	}
	
	



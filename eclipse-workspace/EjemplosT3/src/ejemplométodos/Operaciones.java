package ejemplométodos;

public class Operaciones {
	
		public int sumarDosEnteros(int num1, int num2) {
			
			int resultado;
			
			resultado=num1+num2;
			
			return resultado;
			
			
			
			
			
			
		}
		
		public int restarDosNúmeros(int num1,int num2) {
			
			int resultado;
			
			resultado=num1-num2;
			
			return resultado;
			
		}
		
		public int multiplicarDosNúmeros(int num1,int num2) {
			int resultado;
			
			resultado=num1*num2;
			
			return resultado;
			
		}
		
		public int dividirDosNúmeros(int num1,int num2) {
			
			int resultado;
	
			if(num2!=0) {
		
				resultado=num1/num2;

			}else {
				resultado=0;
			}
			return resultado;
			
			
		}
		
		
		
	
	
	

}

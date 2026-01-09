package ejemplo1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//los construcctores no se heredan
		
		Alumno a1= new Alumno ("Mario","Pérez Acosta","224443X",1,18,7.5);
		Profesor p1=new Profesor("Marioo","Peerez","hfhfhjfhjf",1,19,"holi",4.5);
		Persona per1= new Persona("Marito","Perecito","gtgttg",1,13);
		
		System.out.println("Holi"+p1);
		System.out.println("FFF"+a1);
		System.out.println("hhh"+per1);
		
		System.out.println(per1.sumarEdad(3));   
		System.out.println(a1.sumarEdad(0));
		
		
		
		
		
		
		
		
	}

}

package ejercicio1;

public class Cabecera {
	

	private String asignatura;

	private String aula;

	private String fecha;

	

	public Cabecera(String Asignatura, String Aula, String Fecha) {

		this.asignatura=Asignatura;

		this.aula=Aula;

		this.fecha=Fecha;

	}

	

	//Getters and setters

	

	public String getAsignatura () {

		return asignatura;	

	}

	

	public void setAsignatura (String asignatura) {

		 this.asignatura=asignatura;	

	}

	

	public String getAula () {

		return aula;

	}

	

	public void setAula (String aula) {

		 this.aula=aula; 
		 
	}

	

	public String getFecha () {

		return fecha;	

	}

	

	public void setFecha (String fecha) {

		 this.fecha=fecha;

	}

	


	public void ImprimirCabecera () {

		

		System.out.println("Asignatura: " +asignatura);

		System.out.println("Aula: " +aula);

		System.out.println("Fecha: " +fecha);

		

	}



	@Override
	public String toString() {
		return "Cabecera [asignatura=" + asignatura + ", aula=" + aula + ", fecha=" + fecha + "]";
	}



}
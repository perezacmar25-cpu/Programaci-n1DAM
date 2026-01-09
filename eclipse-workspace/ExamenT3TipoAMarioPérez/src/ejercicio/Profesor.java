package ejercicio;

public class Profesor {
	
	private String nombreApellidos;
	private int id;
	private int antiguedad;
	private int horasMes;
	public Profesor(String nombreApellidos, int id, int antiguedad, int horasMes) {
	
		this.nombreApellidos = nombreApellidos;
		this.id = id;
		this.antiguedad = antiguedad;
		this.horasMes = horasMes;
	}
	
	
	public Profesor() {
		
	}


	public String getNombreApellidos() {
		return nombreApellidos;
	}
	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public int getHorasMes() {
		return horasMes;
	}
	public void setHorasMes(int horasMes) {
		this.horasMes = horasMes;
	}
	@Override
	public String toString() {
		return "Profesor [nombreApellidos=" + nombreApellidos + ", id=" + id + ", antiguedad=" + antiguedad
				+ ", horasMes=" + horasMes + "]";
	}
	
	
	
	
	public double calcularSueldo(double pagaHora, double por) {
		double sueldo;
		int cien=100;
		
		sueldo=horasMes*pagaHora-(por/cien);
		return sueldo;
		
		
		
	}
	
	

}

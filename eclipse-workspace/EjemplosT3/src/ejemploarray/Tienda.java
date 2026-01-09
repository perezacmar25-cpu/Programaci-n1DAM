package ejemploarray;

import java.util.Arrays;

public class Tienda {

	private String nombre;
	private Producto [] listaProductos;
	private Producto p;
	
	public Tienda(String nombre, Producto[] listaProductos, Producto p) {
		
		this.nombre = nombre;
		this.listaProductos = listaProductos;
		this.p=p;
		
	}
	public String getNombre() {
		
		return nombre;
		
	}
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	public Producto[] getListaProductos() {
		
		return listaProductos;
		
	}
	
	public void setListaProductos(Producto [] listaProductos) {
		
		this.listaProductos = listaProductos;
		
	}

	public String toString() {
		return "Tienda [nombre=" + nombre + ", listaProductos=" + Arrays.toString(listaProductos) + "]";
	}
	
	
	
	public void agregar (Producto p, int cont) {
		
		 listaProductos[cont]=p;
		
	}
	
	public int buscar(int id) {
		int i=0;
		boolean encontrado = false;
		
		while(i< listaProductos.length && !encontrado) {
		
			if(listaProductos[i].getId()==id) {
				encontrado=true;
			}else {
				i++;
			}
			
			if(encontrado) { 
				
				return i;
				
			}else {
				
				return -1;
				
			}
		
		}
		return i;
		
		
		
	}
	
	public void modificarPrecio(Producto p, double precio2) {
		
		
		

		
	}
	
	public double calcularMedia() {
		
		double suma=0;
		double media;
		for(int i=0;i<listaProductos.length;i++) {
			suma+=listaProductos[i].getPrecio();
			
		}
		media=suma/listaProductos.length;
		return media;
		

	}
	
	
	public Producto[] findByName(String nombre,int tam) {
		Producto[]listaNombre=new Producto[listaProductos.length];
		for(int i=0;i<listaProductos.length;i++) {
		if(nombre.equalsIgnoreCase(listaProductos[i].getNombre())) {
			
			listaNombre[i]=listaProductos[i];
			
		}
		
		}
		
		return listaNombre;
	}
	
	
	
	
	
	
	
	
		
		
		
	}
	
	


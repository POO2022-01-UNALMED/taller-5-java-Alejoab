package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	
	
	public Animal() {
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	
	
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public Zona getZona(){
		return zona;
	}
	
	public static void setTotalAnimales(int total) {
		totalAnimales = total;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\nAves: "+Ave.cantidadAves()+"\nReptiles: "+Reptil.cantidadReptiles()+"\nPeces: "+Pez.cantidadPeces()+"\nAnfibios: "+Anfibio.cantidadAnfibios();
	}
		
	public String toString() {
		if(zona == null) {
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
			
		} else {
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona.getNombre()+", en el "+zona.getZoo().getNombre();
		}
		
	}
	
	public String movimiento() {
		return "desplazarse";
	}
}

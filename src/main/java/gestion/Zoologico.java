package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int total = 0;
		
		for(Zona zona:zonas) {
			total += zona.cantidadAnimales();
		}
		
		return total;
	}
}

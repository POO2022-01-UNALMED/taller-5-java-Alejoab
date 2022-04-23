package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	
	
	public Ave(){
		super();
		Ave.listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
	}
	
	
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public void setColorPlumas(String color) {
		colorPlumas = color;
	}
	
	
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		Ave a1 = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		listado.add(a1);
		return a1;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		Ave a1 = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		listado.add(a1);
		return a1;
	}
	
	public String movimiento() {
		return "volar";
	}
}

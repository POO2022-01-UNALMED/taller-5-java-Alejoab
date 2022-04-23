package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private boolean venenoso;
	private String colorPiel;
	
	
	
	public Anfibio(){
		super();
		Anfibio.listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String color, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.venenoso = venenoso;
		this.colorPiel = color;
		Anfibio.listado.add(this);
	}
	
	
	
	public boolean isVenenoso() {
		return venenoso;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setvenenosos(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public void setColorPiel(String color) {
		this.colorPiel = color;
	}
	
	
	
	public String movimiento() {
		return "saltar";
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		Anfibio a1 = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		listado.add(a1);
		return a1;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		Anfibio a1 = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		listado.add(a1);
		return a1;
	}
}

package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	
	public Pez(){
		super();
		Pez.listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int aletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = aletas;
		Pez.listado.add(this);
	}
	
	
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	
	public void setColorEscamas(String color) {
		this.colorEscamas = color;
	}
	
	public void setLargoCola(int aletas) {
		this.cantidadAletas = aletas;
	}
	
	
	
	public String movimiento() {
		return "nadar";
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		Pez a1 = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		listado.add(a1);
		return a1;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		Pez a1 = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		listado.add(a1);
		return a1;
	}
}

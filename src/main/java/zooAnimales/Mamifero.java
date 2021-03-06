package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	
	
	public Mamifero(){
		super();
		Mamifero.listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.listado.add(this);
	}
	
	
	
	public boolean isPelaje() {
		return pelaje;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		Mamifero a1 = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		listado.add(a1);
		return a1;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		Mamifero a1 = new Mamifero(nombre, edad, "selva", genero, true, 4);
		listado.add(a1);
		return a1;
	}
}

package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	
	public Reptil(){
		super();
		Reptil.listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
	}
	
	
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
	
	public void setColorEscamas(String color) {
		this.colorEscamas = color;
	}
	
	public void setLargoCola(int largo) {
		this.largoCola = largo;
	}
	
	
	
	public String movimiento() {
		return "reptar";
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		Reptil a1 = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		listado.add(a1);
		return a1;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		Reptil a1 = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		listado.add(a1);
		return a1;
	}
}

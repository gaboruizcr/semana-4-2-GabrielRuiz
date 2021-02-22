/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Arbol extends Vegetal implements Actor{

	private String marca;
	private String nombrecientifico;
	private double atributo1;
		
	
	/**
	 * @param nombre
	 * @param tipo
	 * @param color
	 * @param marca
	 * @param nombrecientifico
	 * @param atributo1
	 */
	public Arbol(String nombre, String tipo, String color, String marca, String nombrecientifico, double atributo1) {
		super(nombre, tipo, color);
		this.marca = marca;
		this.nombrecientifico = nombrecientifico;
		this.atributo1 = atributo1;
	}



	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre + ">> Hola");
	}
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return super.getTipo();
	}
	@Override
	public void setTipo(String tipo) {
		// TODO Auto-generated method stub
		super.setTipo(tipo);
	}
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}
	@Override
	public void mostraste() {
		// TODO Auto-generated method stub
		System.out.println("Aparecio el Arbol");
	}
	@Override
	public void desparecer() {
		// TODO Auto-generated method stub
		super.desparecer();
	}
	@Override
	public void florear() {
		// TODO Auto-generated method stub
		super.florear();
	}
	public void florear(String detalle) {
		System.out.println("polimorfismo en florear");
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	public void darFrutos() {
		System.out.println("Crecieron frutos");
	}
	public void crecer() {
		System.out.println("Crecieron frutos");
	}
	public void generarsombra() {
		System.out.println("Generando sombra");
	}
	
	@Override
	public String toString() {
		return "Arbol [marca=" + marca + ", nombrecientifico=" + nombrecientifico + ", atributo1=" + atributo1 + "]";
	}


}

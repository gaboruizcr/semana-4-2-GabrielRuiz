/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Vehiculo implements Actor, ObjetoInerte {
	private String marca;
	private String color;
	private String a�o;


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
	public void estarInerte() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo3() {
		// TODO Auto-generated method stub
		
	}

	
	/**
	 * @param marca
	 * @param color
	 * @param a�o
	 */
	public Vehiculo(String marca, String color, String a�o) {
		super();
		this.marca = marca;
		this.color = color;
		this.a�o = a�o;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the a�o
	 */
	public String getA�o() {
		return a�o;
	}

	/**
	 * @param a�o the a�o to set
	 */
	public void setA�o(String a�o) {
		this.a�o = a�o;
	}

	public void transportar() {
		System.out.println("Vehiculo transportando");
	}
	public void detener() {
		System.out.println("Vehiculo se esta deteniendo");
	}
	public void avanzar() {
		System.out.println("Vehiculo avanza");
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", color=" + color + ", a�o=" + a�o + "]";
	}

	

		
}

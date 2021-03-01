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
	private String año;


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
	 * @param año
	 */
	public Vehiculo(String marca, String color, String año) {
		super();
		this.marca = marca;
		this.color = color;
		this.año = año;
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
	 * @return the año
	 */
	public String getAño() {
		return año;
	}

	/**
	 * @param año the año to set
	 */
	public void setAño(String año) {
		this.año = año;
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
		return "Vehiculo [marca=" + marca + ", color=" + color + ", año=" + año + "]";
	}

	

		
}

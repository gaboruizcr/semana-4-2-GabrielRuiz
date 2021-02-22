/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public abstract class Persona implements Actor {

	public String nombre;
	public String identificacion;
	public int edad;
	
	

	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy actuando desde persona!");
	}

	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		System.out.println("Ay si que divertido!");
	}

	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		System.out.println("Chao2");
	}

	public void saludar() {
		System.out.println("Hola mi nombre es " + nombre + "y tengo " + edad + " años.");
	}
	public void despedirse() {
		System.out.println("Chao");
	}
	public void comer() {
		System.out.println("Estoy comiendo");
	}
}

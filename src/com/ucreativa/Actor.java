/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
/**
 * @author gruiz
 *
 */
public interface Actor {
	public static final String nombreArtistico = "Ruiz";
	public static final int añosExperiencia = 4;
	public static final String tipo = "Deportista";
	
	abstract void actuar();
	
	abstract void divertir();
	
	abstract void desaparecer();
	
	static String identificador() {
		return "Yo soy un actor";

	}

	
	
}
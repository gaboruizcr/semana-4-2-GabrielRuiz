/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public interface Actor {
	public static final String nombreArtistico = "Ruiz";
	public static final int a�osExperiencia = 4;
	public static final String tipo = "Deportista";
	
	abstract void actuar();
	
	abstract void divertir();
	
	abstract void desaparecer();
	
	static String identificador() {
		return "Yo soy un actor";

	}

	
	
}
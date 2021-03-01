/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Vegetal {
	private String nombre;
	private String tipo;
	private String color;
		
	
	//Get - Set
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	 * Constructor
	 * @param nombre
	 * @param tipo
	 * @param color
	 */
	public Vegetal(String nombre, String tipo, String color) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.color = color;
	}


		
	//metodos
	public void mostraste() {
		// Me mostre
		System.out.println("HOLA");
	}
	
	public void desparecer( ) {
		System.out.println("Chao");
	}
	
	public void florear( ) {
		System.out.println("Floreando");
	}
		
	// overrides y otros...

	@Override
	public String toString() {
		return "Vegetal [nombre=" + nombre + ", tipo=" + tipo + ", color=" + color + "]";
	}

}

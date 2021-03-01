/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Arbusto extends Vegetal implements Actor{
	private String tamaño;
	private String color;
	private String atributo1;
	
	

	/**
	 * @param nombre
	 * @param tipo
	 * @param color
	 * @param tamaño
	 * @param color2
	 * @param atributo1
	 */
	public Arbusto(String nombre, String tipo, String color, String tamaño, String color2, String atributo1) {
		super(nombre, tipo, color2);
		this.tamaño = tamaño;
		this.color = color;
		this.atributo1 = atributo1;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}


	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
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
	public void mostraste() {
		// TODO Auto-generated method stub
		super.mostraste();
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


	/**
	 * @return the tamaño
	 */
	public String getTamaño() {
		return tamaño;
	}


	/**
	 * @param tamaño the tamaño to set
	 */
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
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
	 * @return the atributo1
	 */
	public String getAtributo1() {
		return atributo1;
	}


	/**
	 * @param atributo1 the atributo1 to set
	 */
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	
	public void crecer() {
		System.out.println("Arbusto crecio");
	}
	public void generarsombra() {
		System.out.println("Arbusto generando sombra");
	}
	public void adornar() {
		System.out.println("Arbusto adornando jardin");
	}

	@Override
	public String toString() {
		return "Arbusto [tamaño=" + tamaño + ", color=" + color + ", atributo1=" + atributo1 + ", Nombre="
				+ getNombre() + ", Tipo=" + getTipo() + ", Tamaño=" + getTamaño() + ", Color2="
				+ getColor() + ", Atributo1=" + getAtributo1() + "]";
	}





	

}

/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Arbusto extends Vegetal implements Actor{
	private String tama�o;
	private String color;
	private String atributo1;
	
	

	/**
	 * @param nombre
	 * @param tipo
	 * @param color
	 * @param tama�o
	 * @param color2
	 * @param atributo1
	 */
	public Arbusto(String nombre, String tipo, String color, String tama�o, String color2, String atributo1) {
		super(nombre, tipo, color2);
		this.tama�o = tama�o;
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
	 * @return the tama�o
	 */
	public String getTama�o() {
		return tama�o;
	}


	/**
	 * @param tama�o the tama�o to set
	 */
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Arbusto [tama�o=" + tama�o + ", color=" + color + ", atributo1=" + atributo1 + ", Nombre="
				+ getNombre() + ", Tipo=" + getTipo() + ", Tama�o=" + getTama�o() + ", Color2="
				+ getColor() + ", Atributo1=" + getAtributo1() + "]";
	}





	

}

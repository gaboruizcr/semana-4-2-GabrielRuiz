/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Bicicleta extends Vehiculo{
	private int tama�o;
	private String tieneMarchas;
	private String tipo;
	
	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		super.actuar();
	}
	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		super.divertir();
	}
	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		super.desaparecer();
	}
	@Override
	public void estarInerte() {
		// TODO Auto-generated method stub
		super.estarInerte();
	}
	@Override
	public void metodo2() {
		// TODO Auto-generated method stub
		super.metodo2();
	}
	@Override
	public void metodo3() {
		// TODO Auto-generated method stub
		super.metodo3();
	}
	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return super.getMarca();
	}
	@Override
	public void setMarca(String marca) {
		// TODO Auto-generated method stub
		super.setMarca(marca);
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
	public String getA�o() {
		// TODO Auto-generated method stub
		return super.getA�o();
	}
	@Override
	public void setA�o(String a�o) {
		// TODO Auto-generated method stub
		super.setA�o(a�o);
	}
	@Override
	public void transportar() {
		// TODO Auto-generated method stub
		super.transportar();
	}
	@Override
	public void detener() {
		// TODO Auto-generated method stub
		super.detener();
	}
	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		super.avanzar();
	}
	/**
	 * constructor
	 * @param marca
	 * @param color
	 * @param a�o
	 * @param tama�o
	 * @param tieneMarchas
	 * @param tipo
	 */
	public Bicicleta(String marca, String color, String a�o, int tama�o, String tieneMarchas, String tipo) {
		super(marca, color, a�o);
		this.tama�o = tama�o;
		this.tieneMarchas = tieneMarchas;
		this.tipo = tipo;
	}
	/**
	 * @return the tama�o
	 */
	public int getTama�o() {
		return tama�o;
	}
	/**
	 * @param tama�o the tama�o to set
	 */
	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
	
	/**
	 * @return the tieneMarchas
	 */
	public String getTieneMarchas() {
		return tieneMarchas;
	}
	/**
	 * @param tieneMarchas the tieneMarchas to set
	 */
	public void setTieneMarchas(String tieneMarchas) {
		this.tieneMarchas = tieneMarchas;
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
	
	public void derrapa() {
		System.out.println("Bicicleta derrapa");
	}
	public void salta() {
		System.out.println("Bicicleta salta");
	}
	public void seParaEnUnaLlanata() {
		System.out.println("Bicicleta se para en una llanta");
	}
	
	@Override
	public String toString() {
		return "Bicicleta [tama�o=" + tama�o + ", tieneMarchas=" + tieneMarchas + ", tipo=" + tipo + ", Marca="
				+ getMarca() + ", Color=" + getColor() + ", A�o=" + getA�o() + "]";
	}


}

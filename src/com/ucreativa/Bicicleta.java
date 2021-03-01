/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Bicicleta extends Vehiculo{
	private int tamaño;
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
	public String getAño() {
		// TODO Auto-generated method stub
		return super.getAño();
	}
	@Override
	public void setAño(String año) {
		// TODO Auto-generated method stub
		super.setAño(año);
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
	 * @param año
	 * @param tamaño
	 * @param tieneMarchas
	 * @param tipo
	 */
	public Bicicleta(String marca, String color, String año, int tamaño, String tieneMarchas, String tipo) {
		super(marca, color, año);
		this.tamaño = tamaño;
		this.tieneMarchas = tieneMarchas;
		this.tipo = tipo;
	}
	/**
	 * @return the tamaño
	 */
	public int getTamaño() {
		return tamaño;
	}
	/**
	 * @param tamaño the tamaño to set
	 */
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
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
		return "Bicicleta [tamaño=" + tamaño + ", tieneMarchas=" + tieneMarchas + ", tipo=" + tipo + ", Marca="
				+ getMarca() + ", Color=" + getColor() + ", Año=" + getAño() + "]";
	}


}

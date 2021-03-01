/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Coche extends Vehiculo{
	private String tipo;
	private int cantPuertas;
	private String condicion;
	
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
	 * @param tipo
	 * @param cantPuertas
	 * @param condicion
	 */
	public Coche(String marca, String color, String año, String tipo, int cantPuertas, String condicion) {
		super(marca, color, año);
		this.tipo = tipo;
		this.cantPuertas = cantPuertas;
		this.condicion = condicion;
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
	 * @return the cantPuertas
	 */
	public int getCantPuertas() {
		return cantPuertas;
	}
	/**
	 * @param cantPuertas the cantPuertas to set
	 */
	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	/**
	 * @return the condicion
	 */
	public String getCondicion() {
		return condicion;
	}
	/**
	 * @param condicion the condicion to set
	 */
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	
	public void derrapa() {
		System.out.println("Coche derrapa");
	}
	public void acelera() {
		System.out.println("Coche acelera");
	}
	public void volcar() {
		System.out.println("Coche se vuelca");
	}
	@Override
	public String toString() {
		return "Coche [tipo=" + tipo + ", cantPuertas=" + cantPuertas + ", condicion=" + condicion + ", Marca="
				+ getMarca() + ", Color=" + getColor() + ", Año=" + getAño() + "]";
	}
	
	
}

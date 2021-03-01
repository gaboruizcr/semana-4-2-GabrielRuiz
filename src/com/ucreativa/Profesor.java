/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Profesor extends Persona {

	private String correo;
	private int experiencia;
	private double salario;
	

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
	public void saludar() {
		// TODO Auto-generated method stub
		super.saludar();
	}


	@Override
	public void despedirse() {
		// TODO Auto-generated method stub
		super.despedirse();
	}


	@Override
	public void comer() {
		// TODO Auto-generated method stub
		super.comer();
	}


	/**
	 * constructor
	 * @param nombre
	 * @param edad
	 * @param identificacion
	 * @param correo
	 * @param experiencia
	 * @param salario
	 */
	public Profesor(String nombre, int edad, String identificacion,String correo, int experiencia, double salario) {
		super();
		super.edad = edad;
		super.nombre = nombre;
		super.identificacion = identificacion;
		this.correo = correo;
		this.experiencia = experiencia;
		this.salario = salario;
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}


	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}


	/**
	 * @return the experiencia
	 */
	public int getExperiencia() {
		return experiencia;
	}


	/**
	 * @param experiencia the experiencia to set
	 */
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}


	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	public void planear() {
		System.out.println("Estoy planeando");
	}
	public void darclase() {
		System.out.println("Dando clase");
	}
	public void revisarTareaDos() {
		System.out.println("Recuerden que hay que entregarlo completo");
	}
	
	

	@Override
	public String toString() {
		return "Profesor [correo=" + correo + ", experiencia=" + experiencia + ", salario=" + salario + ", nombre="
				+ nombre + ", identificacion=" + identificacion + ", edad=" + edad + "]";
	}


}

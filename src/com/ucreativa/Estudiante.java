/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Estudiante extends Persona {

	private String carrera;
	private String correo;
	private String curso;
	
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
		System.out.println("Estoy desapareciendo desde estudiante!");
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
	 * @param carrera
	 * @param correo
	 * @param curso
	 */
	public Estudiante(String nombre, int edad, String identificacion,String carrera, String correo, String curso) {
		super();
		this.carrera = carrera;
		this.correo = correo;
		this.curso = curso;
	}

	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}


	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
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
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	public void ponerAtencion() {
		System.out.println("Estoy poniendo atencion a la clase");
	}
	public void estudiar() {
		System.out.println("Estoy estudiando");
	}
	public void hacerTarea() {
		System.out.println("Estoy haciendo la tarea");
	}

	@Override
	public String toString() {
		return "Estudiante [carrera=" + carrera + ", correo=" + correo + ", curso=" + curso + ", nombre=" + nombre
				+ ", identificacion=" + identificacion + ", edad=" + edad + "]";
	}
	
	
	

}

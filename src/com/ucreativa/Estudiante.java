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
		// TODO Auto-generated constructor stub
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

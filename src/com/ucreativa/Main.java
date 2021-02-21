/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Arbol arb1 = new Arbol("culantro","tipo1","verde");
		
		arb1.florear();
		arb1.setNombre("Manzana");
		System.out.println(arb1.toString());
		
		
		Persona profe = new Profesor("Gabriel",32,"1235165165", "gabriel.ruiz@ucretaiva.com", 8, 13566);
		
		profe.divertir();
	}

}

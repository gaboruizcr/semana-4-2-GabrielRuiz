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

		System.out.println("---------------------------Arbol-----------------------------------");	
		Arbol arb1 = new Arbol("culantro","tipo1","verde","Epa","ciencia", 3.3);
		
		arb1.generarsombra();
		arb1.setNombre("Manzano");
		System.out.println(arb1.toString());
		System.out.println("-------------------------End Arbol---------------------------------");	
		
		
		System.out.println("---------------------------Arbusto-----------------------------------");	
		Arbusto arbusto1 = new Arbusto("Adelfa", "Berberis thunbergii", "rojo", "pequeño", "amarillo", "bonito");
		
		arbusto1.crecer();
		System.out.println(arbusto1.toString());
		System.out.println("-------------------------End Arbusto---------------------------------");
		
		System.out.println("---------------------------Vegetal-----------------------------------");	
		Vegetal veg1 = new Vegetal("Apio", "largo", "verde");
				
		veg1.florear();
		System.out.println(veg1.toString());
		System.out.println("-------------------------End Vegetal---------------------------------");
		
		System.out.println("---------------------------Vehiculo-----------------------------------");	
		Vehiculo vehi1 = new Vehiculo("Jetta", "automovil", "negro");
				
		vehi1.avanzar();
		System.out.println(vehi1.toString());
		System.out.println("-------------------------End Vehiculo---------------------------------");
		
		System.out.println("---------------------------Coche-----------------------------------");	
		Coche coch1 = new Coche("Volkswagen", "Negro", "2004", "automovil", 4, "Excelente");
		
		coch1.acelera();
		System.out.println(coch1.toString());
		System.out.println("--------------------------End Coche---------------------------------");
		
		
		System.out.println("---------------------------Bicicleta--------------------------------");	
		Bicicleta bici1 = new Bicicleta("Trek", "gris", "1999", 23, "si", "montañera");
		
		bici1.derrapa();
		System.out.println(bici1.toString());
		System.out.println("-------------------------End Bicicleta------------------------------");
		
		System.out.println("---------------------------Estudiante--------------------------------");	
		Estudiante estu1 = new Estudiante("Gabriel", 32, "132135150", "Electronica", "gabriel.ruiz@ucretaiva.com", "Automation");
		
		estu1.ponerAtencion();
		estu1.desaparecer();
		System.out.println(estu1.toString());
		System.out.println("-------------------------End Estudiante------------------------------");
		
		System.out.println("---------------------------Profesor--------------------------------");	
		Profesor per1 = new Profesor("Jose", 33, "16548652","profe@ucreativa.com", 5, 123532153.1);
		
		per1.revisarTareaDos();
		System.out.println(per1.toString());
		System.out.println("-------------------------End Profesor------------------------------");
		
		System.out.println("---------------------------Polimorfismo------------------------------");
		Persona profe = new Profesor("Gabriel",32,"1235165165", "gabriel.ruiz@ucretaiva.com", 8, 13566.1);
		
		profe.divertir();
		System.out.println(profe.toString());
		
		Vegetal veg2 = new Arbol("Guanacaste", "Grande", "Verde", "Costa Rica", "nomeacuerdo", 105.8);
		
		veg2.mostraste();
		System.out.println(veg2.toString());
		System.out.println("---------------------------End Polimorfismo------------------------------");
		
	}

}

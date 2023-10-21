package g_construc_getters_setters_Persona;

/**
 * Programa que resuelve este ejercicio:
 * Escriba un programa Java para crear una clase llamada "Persona" con un atributo de nombre y edad. Cree dos 
 * instancias de la clase "Persona", configure sus atributos usando el constructor e imprima su nombre y edad 
 * utilizando getters y setters. 
 *  
 * Basado en: https://www.w3resource.com/java-exercises/oop/java-oop-exercise-1.php
 * @version 1.0 (Octubre 2023)
 */
public class Main {

	/**
	 * Main es el método al que se llama por defecto
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args) {
		Persona person1 = new Persona("Ean Craig", 11);
		Persona person2 = new Persona("Evan Ross", 12);
		System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
		System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
	}
}


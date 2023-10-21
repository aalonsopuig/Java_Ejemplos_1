package h_construc_getters_setters_Empleado;

/**
 * Programa que resuelve este ejercicio:
 * Escriba un programa Java para crear una clase llamada "Empleado" con un nombre, cargo y atributos de salario, 
 * y métodos para calcular y actualizar el salario. 
 *  
 * Basado en: https://www.w3resource.com/java-exercises/oop/java-oop-exercise-6.php
 * @version 1.0 (Octubre 2023)
 */
public class Main {

	/**
	 * Main es el método al que se llama por defecto
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args) {

		Empleado employee1 = new Empleado("Franziska Waltraud", "HR Manager", 40000);
		Empleado employee2 = new Empleado("Hubertus Andrea", "Software Engineer", 60000);
		System.out.println("\nEmployee Details:");
		employee1.printEmployeeDetails();
		employee2.printEmployeeDetails();

		employee1.raiseSalary(8);
		employee2.raiseSalary(12);

		System.out.println("\nAfter raising salary:");
		System.out.println("\n8% for 'Franziska Waltraud':");
		employee1.printEmployeeDetails();
		System.out.println("\n12% for 'Hubertus Andrea':");
		employee2.printEmployeeDetails();
	}
}

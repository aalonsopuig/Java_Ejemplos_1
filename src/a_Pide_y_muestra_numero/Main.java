package a_Pide_y_muestra_numero;
import java.util.Scanner;
/* 
 * Ejercicio que pide un número al usuario por teclado y a continuación lo muestra por pantalla
 */

/**
 * @author Alejandro Alonso
 * @version 1.0
 * Main es la clase en la que se ejecuta el programa
 */
public class Main {

	/**
	 * Main es el método al que se llama por defecto
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args) {
		int dato; 												//variable que pediremos y mostraremos
		System.out.print("Dame un número: ");					//Pedimos número
		Scanner teclado = new Scanner (System.in);				//Lo tomamos de teclado
		dato=teclado.nextInt();
		System.out.println("El valor introducido es " + dato);	//Muestra
		teclado.close();
	}
}

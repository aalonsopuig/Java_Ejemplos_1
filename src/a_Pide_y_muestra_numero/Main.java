package a_Pide_y_muestra_numero;
import java.util.Scanner;

/* 
 * Ejercicio que pide un n�mero al usuario por teclado y a continuaci�n lo muestra
 */
public class Main {
	
	public static void main(String[] args) {
		int dato; //variable que pediremos y mostraremos
		System.out.print("Dame un n�mero: ");
		Scanner teclado = new Scanner (System.in);
		dato=teclado.nextInt();
		System.out.println("El valor introducido es " + dato);
		teclado.close();
	}

}

package e_for_patron_diamante;

import java.util.Scanner;

/**
 * Programa que resuelve este ejercicio:
 * Escriba un programa en Java que pida un número entero y muestre un patrón de diamante,
 * cuya altura sea el doble que dicho número. Ej para 7 (for). 
 *  
 * Basado en: https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-21.php 
 * @version 1.0 (Octubre 2023)
 */
public class Patron_diamante {

	/**
	 * Main es el método al que se llama por defecto
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args)


	{
		int i,j,r;
		System.out.print("Input number of rows (half of the diamond) : ");
		Scanner in = new Scanner(System.in);
		r = in.nextInt();
		for(i=0;i<=r;i++)
		{
			for(j=1;j<=r-i;j++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.print("\n");
		}

		for(i=r-1;i>=1;i--)
		{
			for(j=1;j<=r-i;j++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.print("\n");
		}

	}
}

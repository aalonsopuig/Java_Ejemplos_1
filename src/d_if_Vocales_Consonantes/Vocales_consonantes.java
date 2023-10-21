package d_if_Vocales_Consonantes;
import java.util.Scanner;

/**
 * Programa que resuelve este ejercicio:
 * Escriba un programa Java que requiera que el usuario ingrese un solo carácter del alfabeto. 
 * Imprima Vocal o Consonante, dependiendo de la entrada del usuario. Si la entrada del usuario 
 * no es una letra (entre a y z o A y Z), o es una cadena de longitud > 1, imprime un mensaje de error. (if) 
 *  
 * Basado en: https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-8.php
 * @version 1.0 (Octubre 2023)
 */
public class Vocales_consonantes {

	/**
	 * Main es el método al que se llama por defecto
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Input an alphabet: ");
		String input = in.next().toLowerCase();

		boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
		boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
		boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
				|| input.equals("o") || input.equals("u");

		if (input.length() > 1)
		{
			System.out.println("Error. Not a single character.");
		}
		else if (!(uppercase || lowercase))
		{
			System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
		}
		else if (vowels)
		{
			System.out.println("Input letter is Vowel");
		}
		else
		{
			System.out.println("Input letter is Consonant");
		}
	}
}

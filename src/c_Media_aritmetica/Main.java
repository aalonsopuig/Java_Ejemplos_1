package c_Media_aritmetica;
import java.util.Locale;
import java.util.Scanner;

/**
 * Aplicación que calcula la media aritmética de tres números
 * El usuario aporta dichos números.
 * @author Alejandro Alonso
 * @version 1.0 (Septiembre 2023)
 */
public class Main {

	/**
	 * Main es el método al que se llama por defecto
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args) {
		double dato1, dato2, dato3, media; //aún no hemos estudiado los arrays, por lo que usamos tres variables

		//Pedimos datos
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);	//Decimales como un punto
		System.out.print("Dato 1?: ");
		dato1 = teclado.nextDouble();
		System.out.print("Dato 2?: ");
		dato2 = teclado.nextDouble();
		System.out.print("Dato 3?: ");
		dato3 = teclado.nextDouble();

		//Cálculos
		media = (dato1 + dato2 + dato3)/3.0;

		//Mostramos el resultado
		System.out.println("Media: " + media);

	}

}

/** 
 * @author Alejandro Alonso
 * @version 1.0
 * @date Septiembre 2023
 * Aplicaci�n que calcula la el �rea y per�metro de una circunferencia
 * El usuario aporta el radio por teclado.
 */
package b_Area_y_perimetro;

import java.util.Scanner;

/**
 * 
 */
public class Main {

	/**
	 * @param args No utilizados en esta versi�n
	 */
	public static void main(String[] args) {
		double radio, area, perimetro;
		
		//Introducci�n del radio por teclado
		Scanner teclado =new Scanner(System.in);
		System.out.print("Radio? (cm) ");
		radio=teclado.nextDouble();
		
		//C�lculos
		area = Math.PI * Math.pow(radio, 2);
		perimetro = 2 * Math.PI * radio;
		
		//Muestra resultados
		System.out.println("Area: " + area + " cm2");
		System.out.println("Per�metro: " + perimetro + " cm ");
	}
}

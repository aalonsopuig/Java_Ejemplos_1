/** 
 * @author Alejandro Alonso
 * @version 1.0
 * @date Septiembre 2023
 * Aplicación que calcula la el área y perímetro de una circunferencia
 * El usuario aporta el radio por teclado.
 */
package b_Area_y_perimetro;

import java.util.Scanner;

/**
 * 
 */
public class Main {

	/**
	 * @param args No utilizados en esta versión
	 */
	public static void main(String[] args) {
		double radio, area, perimetro;
		
		//Introducción del radio por teclado
		Scanner teclado =new Scanner(System.in);
		System.out.print("Radio? (cm) ");
		radio=teclado.nextDouble();
		
		//Cálculos
		area = Math.PI * Math.pow(radio, 2);
		perimetro = 2 * Math.PI * radio;
		
		//Muestra resultados
		System.out.println("Area: " + area + " cm2");
		System.out.println("Perímetro: " + perimetro + " cm ");
	}
}

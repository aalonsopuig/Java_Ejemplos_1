package j_sobrecarga_Medias;

/**
 * Programa que resuelve este ejercicio:
 * Calcular la media de dos o tres números utilizando sobrecarga de métodos.
 *  
 * @author Alejandro Alonso Puig
 * @version 1.0 (Octubre 2023)
 */
public class Main {

	/**
	 * Main es el método al que se llama por defecto
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args) {
			
		Media Media1 = new Media(4.2, 2.5);
		Media Media2 = new Media(4,8.7,3);
		System.out.println(Media1.getMedia());
		System.out.println(Media2.getMedia());
	}
}
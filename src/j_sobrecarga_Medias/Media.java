package j_sobrecarga_Medias;

/**
 * Clase que contiene los métodos que calculan la media
 */
public class Media {

	private double media = 0;
	
	/**
	 * Constructor para cálculo de media
	 * @param a	Un valor de entrada
	 * @param b Otro valor de entrada
	 */
	public Media (double a, double b){
		media = (a+b)/2;
	}

	/**
	 * Constructor sobrecargado para cálculo de media de tres números
	 * @param a Primer número
	 * @param b Segundo número
	 * @param c Tercer número
	 */
	public Media (double a, double b, double c){
		media =(a+b+c)/3;
	}

	/**
	 * Getter de resultado
	 * @return Resultado de la media realizada por el constructor
	 */
	public String getMedia () {
		return ("Media: " + media);
	}
}

package j_sobrecarga_Medias;

public class Media {

	private double media = 0;
	
	public Media (double a, double b){
		media = (a+b)/2;
	}
	
	public Media (double a, double b, double c){
		media =(a+b+c)/3;
	}

	public String getMedia () {
		return ("Media: " + media);
	}
}

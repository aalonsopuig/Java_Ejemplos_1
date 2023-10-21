package g_construc_getters_setters_Persona;

/**
 * Clase Persona con getters
 */
public class Persona {
	private String name;
	private int age;

	/**
	 * Constructor
	 * @param name Nombre de la persona
	 * @param age  Edad de la persona
	 */
	public Persona(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * Getter de Persona
	 * @return Nombre de la persona
	 */
	public String getName() {
		return name;
	}
	/**
	 * Getter de Persona
	 * @return Edad de la persona
	 */
	public int getAge() {
		return age;
	}
}

package h_construc_getters_setters_Empleado;

/**
 * Clase Empleado
 */
public class Empleado {
	private String name;
	private String jobTitle;
	private double salary;

	/**
	 * Constructor
	 * @param name		Nombre
	 * @param jobTitle	Título
	 * @param salary	Salario
	 */
	public Empleado(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	/**
	 * Getter
	 * @return	Nombre
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter
	 * @param name Nombre
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter
	 * @return	Título
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * Setter
	 * @param jobTitle	Título
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * Getter
	 * @return	Salario
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Setter
	 * @param salary	Salario
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * Subida de salario
	 * @param percentage	Procentaje de aumento
	 */
	public void raiseSalary(double percentage) {
		salary = salary + salary * percentage / 100;
	}

	/**
	 * Detalles de empleado
	 */
	public void printEmployeeDetails() {
		System.out.println("Name: " + name);
		System.out.println("Job Title: " + jobTitle);
		System.out.println("Salary: " + salary);
	}
}

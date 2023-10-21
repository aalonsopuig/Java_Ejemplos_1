package i_arraylist_books;


import java.util.ArrayList;


/**
 * Programa que resuelve este ejercicio:
 * Escriba un programa Java con una clase llamada “Book" con atributos para title, author e ISBN, y métodos para 
 * agregar y eliminar libros de una colección. (Pista: Utiliza ArrayList para almacenar los libros) 
 *  
 * Basado en: https://www.w3resource.com/java-exercises/oop/java-oop-exercise-5.php
 * @version 1.0 (Octubre 2023)
 */
public class Main {

	/**
	 * Main es el método al que se llama por defecto
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args) {
		Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
		Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
		Book.add_Book(book1);
		Book.add_Book(book2);
		ArrayList < Book > bookCollection = Book.get_BookCollection();
		System.out.println("List of books:");
		for (Book book: bookCollection) {
			System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
		}
		Book.remove_Book(book1);
		System.out.println("\nAfter removing " + book1.get_Title() + ":");
		System.out.println("List of books:");
		for (Book book: bookCollection) {
			System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
		}
	}
}

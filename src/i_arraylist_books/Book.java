package i_arraylist_books;

import java.util.ArrayList;

/**
 * Clase Book
 */
public class Book {
	private String title;
	private String author;
	private String ISBN;
	private static ArrayList < Book > bookCollection = new ArrayList < Book > ();

	/**
	 * Constructor
	 * @param title	Título
	 * @param author	Autor
	 * @param ISBN	ISBN
	 */
	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}

	/**
	 * Getter
	 * @return	Título
	 */
	public String get_Title() {
		return title;
	}

	/**
	 * Setter
	 * @param title	Título
	 */
	public void set_Title(String title) {
		this.title = title;
	}

	/**
	 * Getter
	 * @return	Autor
	 */
	public String get_Author() {
		return author;
	}

	/**
	 * Setter
	 * @param author	Autor
	 */
	public void set_Author(String author) {
		this.author = author;
	}

	/**
	 * Getter
	 * @return	ISBN
	 */
	public String get_ISBN() {
		return ISBN;
	}

	/**
	 * Setter
	 * @param ISBN	ISBN
	 */
	public void set_ISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	/**
	 * Añade libro
	 * @param book	Libro
	 */
	public static void add_Book(Book book) {
		bookCollection.add(book);
	}

	/**
	 * Elimina libro de la lista
	 * @param book	Libro
	 */
	public static void remove_Book(Book book) {
		bookCollection.remove(book);
	}

	/**
	 * Getter
	 * @return	Colección de libros completa
	 */
	public static ArrayList < Book > get_BookCollection() {
		return bookCollection;
	}
}

package homeworkOneDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Book> listOfBooks = new ArrayList<Book>();
		Book newbook = new Book("A Feast For Crows", "George R. R. Martin", "Spectra", "2005", "0-00-224743-7");
		listOfBooks.add(newbook);

		Library library = new Library("My new library", listOfBooks);
		newbook = new Book("A Dance Of Dragons", "George R. R. Martin", "Spectra", "2011", "0-00-224231-4");
		library.addBook(newbook);
		
		library.showBookInfo();
	}

}

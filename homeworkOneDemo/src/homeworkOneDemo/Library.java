package homeworkOneDemo;
import java.util.ArrayList;

public class Library {

private String libraryName;
ArrayList<Book> bookList = new ArrayList<Book>();

public Library(String libraryName, ArrayList<Book> bookList) {
	super();
	this.libraryName = libraryName;
	this.bookList = bookList;
}

public void addBook(Book newBook) {
	bookList.add(newBook);
}

public void showBookInfo() {
	for(int i = 0; i < bookList.size(); i++) {
		Book thisBook = bookList.get(i);
		System.out.println("Book name:" + thisBook.getBookName() 
		+ "\nBook author:" + thisBook.getAuthor() 
		+ "\nYear Published:" +thisBook.getYear()
		+ "\nPublisher:" +thisBook.getPublisher()
		+ "\nISBN:" +thisBook.getIsbn()
		+ "\n======================================"
		);
	}
}
	
}

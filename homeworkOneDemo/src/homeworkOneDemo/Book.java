package homeworkOneDemo;

public class Book {

private String bookName;
private String author;
private String publisher;
private String year;
private String isbn;

public Book(String bookName, String author, String publisher, String year, String isbn) {
	super();
	this.bookName = bookName;
	this.author = author;
	this.publisher = publisher;
	this.year = year;
	this.isbn = isbn;
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getPublisher() {
	return publisher;
}

public void setPublisher(String publisher) {
	this.publisher = publisher;
}

public String getYear() {
	return year;
}

public void setYear(String year) {
	this.year = year;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}
	
}

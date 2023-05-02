package ncs.test8;

import ncs.test7.Book;

public class BookStore {
	public static void main(String[] args) {
		Book bookdata; 
		BookUpdater bookupdate; 
		
		bookdata = new Book("It","HTML5",30000,15);
		
		System.out.printf("%5s\n %s %s\n","기본정보",bookdata.getBookName(),bookdata.getBookPrice());
		
		bookupdate = new BookUpdater(bookdata);
		
		bookupdate.updateBookPrice();
		bookupdate.getBookData();
		System.out.printf("%6s\n %s %s\n","변경된정보",bookdata.getBookName(),bookdata.getBookPrice());
		
		
	}
}

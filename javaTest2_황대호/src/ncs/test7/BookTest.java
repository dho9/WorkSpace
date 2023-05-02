package ncs.test7;

public class BookTest {

	public static void main(String[] args) {
		Book bookArray [] = new Book[5];
		Book book1 = new Book("IT", "SQL Plus", 50000.0, 5.0);
		Book book2 = new Book("IT", "Java 2.0", 40000.0, 3.0);
		Book book3 = new Book("IT", "JSP Servlet", 60000.0, 6.0);
		Book book4 = new Book("Nobel", "davincicode", 30000.0, 10.0);
		Book book5 = new Book("Nobel", "cloven hoof", 50000.0, 15.0);
		
		bookArray [0] = book1;
		bookArray [1] = book2;
		bookArray [2] = book3;
		bookArray [3] = book4;
		bookArray [4] = book5;
		double sum =0;
		for(int i=0; i<bookArray.length; i++) {
			System.out.printf("%s %s %8.1f원 %5.1f%% \n",bookArray[i].getCategory(),bookArray[i].getBookName(),bookArray[i].getBookPrice(),bookArray[i].getBookDiscountRate());
			 sum += (bookArray[i].getBookPrice()*(100-bookArray[i].getBookDiscountRate())/100);
		}
		System.out.println("책 가격의 합 : "+sum+"원");
		
	}
}

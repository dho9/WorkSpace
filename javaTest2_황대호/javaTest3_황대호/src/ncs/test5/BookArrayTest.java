package ncs.test5;

public class BookArrayTest {

	public static void main(String[] args) {

		
		Book bArray [] = new Book[3];
		
		Book book1 = new Book("자바의정석", "남궁성", "도우출판", 30000, 0.1);
		Book book2 = new Book("열혈강의 자바", "구정은", "프리렉", 29000, 0.1);
		Book book3 = new Book("객체지향 JAVA8", "금영욱", "북스홈", 30000, 0.1);
		bArray[0] = book1;
		bArray[1] = book2;
		bArray[2] = book3;

		for(int i =0; i< bArray.length; i++) {
			System.out.printf("%s,%s,%s,%d,%.0f%%할인 \n할인된가격 : %.0f원 \n",bArray[i].getTitle(), bArray[i].getAuthor(), bArray[i].getPublisher(),bArray[i].getPrice(), bArray[i].getDiscountRate()*100, bArray[i].getPrice()-(bArray[i].getPrice()/(bArray[i].getDiscountRate()*100))); 	
		}
	
	}

}

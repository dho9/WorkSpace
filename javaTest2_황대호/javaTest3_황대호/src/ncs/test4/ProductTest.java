package ncs.test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 : ");
		String name = sc.nextLine();
		
		System.out.print("가격 :");
		int price = sc.nextInt();
		System.out.print("수량 : ");
		int quantity = sc.nextInt();
		
		Product p = new Product(name, price, quantity);
		
		System.out.println(p.information());
		System.out.printf("총 구매가격 : %d 원", p.getPrice()*p.getQuantity());
	}
	}
 

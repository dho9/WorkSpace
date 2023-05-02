package ncs.test3;

public class TvTest {

	public static void main(String[] args) {
		Tv tvArray[] = new Tv[3];
		Tv tv1 = new Tv("INFINIA", 1500000, "LED TV");
		Tv tv2 = new Tv("XCANVAS", 1000000, "LCD TV");
		Tv tv3 = new Tv("CINEMA", 2000000, "3D TV");
		

		tvArray[0] = tv1;
		tvArray[1] = tv2;
		tvArray[2] = tv3;

		for (int i = 0; i < tvArray.length; i++) {
			System.out.println(tvArray[i]);
		}
		int max = tv1.getPrice();
		int min = tv1.getPrice();

		for (int i = 1; i < tvArray.length; i++) {
			if (max < tvArray[i].getPrice()) {
				max = tvArray[i].getPrice();
				String name = tvArray[i].getName();

				System.out.println("가격이 가장 비싼 제품 : " + name);
			}
			if (min > tvArray[i].getPrice()) {
				min = tvArray[i].getPrice();
				String name = tvArray[i].getName();
				System.out.println("가격이 가장 저렴한 제품 : " + name);
			}

		}

	}

}

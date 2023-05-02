package ncs.test9;

public class PlaneTest {

	public static void main(String[] args) {

		Airplane air = new Airplane("L747",1000);
		Cargoplane cargo = new Cargoplane("C40",1000);
		
		System.out.println("Plane \t\t fuelSize");
		System.out.println("----------------------------------");
		System.out.printf("%s \t\t %s\n",air.getPlaneName(), air.getFuelSize() );
		System.out.printf("%s \t\t %s\n",cargo.getPlaneName(), cargo.getFuelSize() );
		System.out.println(100+"운항");
		air.flight(100);
		cargo.flight(100);
		
		System.out.printf("%s \t\t %s\n",air.getPlaneName(), air.getFuelSize() );
		System.out.printf("%s \t\t %s\n",cargo.getPlaneName(), cargo.getFuelSize() );
		
		System.out.println("Plane \t\t fuelSize");
		System.out.println("----------------------------------");
		air.refuel(200);
		cargo.refuel(200);
		System.out.println(200 + " 주유");
		System.out.printf("%s \t\t %s\n",air.getPlaneName(), air.getFuelSize() );
		System.out.printf("%s \t\t %s\n",cargo.getPlaneName(), cargo.getFuelSize() );
		
	}

}

package ncs.test9;

public class Cargoplane extends Plane {

	public Cargoplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {

		
		this.setFuelSize(getFuelSize()-(distance*5));
			
	}


	
	
}

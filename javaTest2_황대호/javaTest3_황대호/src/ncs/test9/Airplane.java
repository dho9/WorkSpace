package ncs.test9;

public class Airplane extends Plane  {

	
	public Airplane() {
		// TODO Auto-generated constructor stub
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {

			
			this.setFuelSize(getFuelSize()-(distance*3));
	}
	
}

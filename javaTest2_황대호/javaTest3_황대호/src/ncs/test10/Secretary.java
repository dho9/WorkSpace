package ncs.test10;

public class Secretary extends Employee  implements Bonus   {

	
	public void incentive(int pay) {
		
		this.setSalary((int)(getSalary()+pay*0.8));
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return  getSalary()*0.1;
				
	}

	
	public Secretary() {
		// TODO Auto-generated constructor stub
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}
	
	
	
}

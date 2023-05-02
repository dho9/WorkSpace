package ncs.test10;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2]; 
		
		employees[0] = new Secretary("Hilery",0,"secretary",800);
		employees[1] = new Sales("Clinten",0,"sales",1200);

		System.out.println(" name    department salary");
		System.out.println("----------------------------");
		for (int i = 0; i < employees.length; i++) {
			System.out.printf("%7s  %9s  %4s\n",employees[i].getName(),employees[i].getDepartment(),employees[i].getSalary());
		} 
		System.out.println();
		System.out.println("인센티브 100 지급");
		((Secretary)employees[0]).incentive(100);
		((Sales)employees[1]).incentive(100);

		System.out.println(" name    department salary    tax");
		System.out.println("----------------------------------");
		
		for (int i = 0; i < employees.length; i++) {
			System.out.printf("%7s  %9s  %4s %8.1f\n",employees[i].getName(),employees[i].getDepartment(),employees[i].getSalary(), employees[i].tax() );
			
		}
		

		
		
	}
}
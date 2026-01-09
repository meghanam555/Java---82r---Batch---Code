package javabatch;

public class Employee1 {
	int empId;
	String empName;
	double empSalary ;
	
	public double annualSalary() {
		return  empSalary*12;
	}
	
	public void initializingValue(int id, String name, double sal)
	{
		empId=id;
		empName=name;
		empSalary=sal;
	}
	public void displayDetails() {
		System.out.println("Employee Id : " +empId);
		System.out.println("Employee Name : " +empName);
		System.out.println("Employee Salary : "+empSalary);
		System.out.println("Employee Annual Salary : " + annualSalary());
		
	}
	
	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		e1.initializingValue(1001, "Bunty", 20000);
		e1.displayDetails();
	
		System.out.println("----------------------------");
		
		Employee1 e2 = new Employee1();
		e2.initializingValue(1002, "Minti", 30000);
		e2.displayDetails();
	
		System.out.println("----------------------------");
		
		Employee1 e3 = new Employee1();
		e3.initializingValue(1003, "Boots", 25000);
		e3.displayDetails();
	}
}

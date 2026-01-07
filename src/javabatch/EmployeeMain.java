package javabatch;
class Employee{
	int empId; // Non - Static (Instance)Variables
	String name;
	double salary;
	
	double AnnualSalary() { // Non - Static Method
		return salary * 12;
	}
	
	void displayEmployeeDetails() { // Non - Static Method
		System.out.println("EmployeeId: " + empId);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
		System.out.println("Employee Annual Salary : " + AnnualSalary());
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empId = 12;
		e1.name = "Sundri";
		e1.salary = 20000;
		
		Employee e2 = new Employee();
		e2.empId = 24;
		e2.name = "Sundra";
		e2.salary = 18000;
		
		
		e1.displayEmployeeDetails();
		
		e2.displayEmployeeDetails();

	}

}

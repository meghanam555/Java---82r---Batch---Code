package javabatch;

public class Methods {
	public static int addition() {
		System.out.println("Addition Started");
		int a = 30;
		int b = 20;
		int sum = a+b;
//		int sum1 = 12+24;
		return sum;
//		System.out.println("The addition of two numbers are : " + sum);
//		System.out.println(a + " and " + b + " sum " + " is " + sum);
//		System.out.println("the sum is : "+sum1);
//		System.out.println("Addition Ended");
		
	}
	
	public static void addition1() {
		System.out.println("Addition Started");
		int a = 30;
		int b = 20;
		int sum = a+b;
		int sum1 = 12+24;
//		System.out.println("The addition of two numbers are : " + sum);
		System.out.println(a + " and " + b + " sum " + " is " + sum);
		System.out.println("the sum is : "+sum1);
		System.out.println("Addition Ended");
		
	}
	public static void main(String[] args) {
		System.out.println("Starting");
//		addition(); // Directly by using the methodname;
//		Methods.addition(); // Calling with respect to classname
//		Methods orv = new Methods();
//		orv.addition();
//		addition1();
		System.out.println(addition());
		System.out.println("Ending");
		
		
	}

}

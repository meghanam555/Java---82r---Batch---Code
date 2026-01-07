package javabatch;

public class StaticMethodwithparameter {

	public static int add(int a, String b) {
//		int a = 10;
//		int b = 20;
		int sum = a+20;
		System.out.println(b);
		return sum;
	}
	public static String Naming() {
		String name = "Shivaram";
		return name;
	}
	public static int add(int c, char ch) {
		int sum = c + ch;
		return sum;
	}
	public static int add1(int a, int b) {
		int sum1 = a+b;
		return sum1;
	}
	public static long add1(long a, int b) {
		long sum1 = a+b;
		return sum1;
	}
	
	public static void main(String[] args) {
//	  System.out.println(add(10, 30));
//	  System.out.println(add(50, 60));
//	  System.out.println(add(10, "Me"));
//	System.out.println(Naming());
//		System.out.println(add(10,'a'));
		System.out.println(add1(5l,59));

	}

}

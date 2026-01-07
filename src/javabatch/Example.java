package javabatch;

public class Example {
	public int NonStaticMethod(int a, int b) {
		System.out.println("I am Doing Addition Operation");
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		Example obj1 = new Example();
		int c = obj1.NonStaticMethod(obj1.NonStaticMethod(12, 12), obj1.NonStaticMethod(12, 12));
		System.out.println(obj1.NonStaticMethod(obj1.NonStaticMethod(12, 12), c));
		
		

	}

}

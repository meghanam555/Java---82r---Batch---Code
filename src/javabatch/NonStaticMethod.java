package javabatch;

public class NonStaticMethod {
	public int addition() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("I am doing Addition Operation");
		return c;
	}
	public static void main(String[] args) {
		NonStaticMethod obj1 = new NonStaticMethod();
		int c = obj1.addition();
		System.out.println(obj1.addition());
		NonStaticMethod obj2 = new NonStaticMethod();
		System.out.println(obj2.addition());
	

	}

}

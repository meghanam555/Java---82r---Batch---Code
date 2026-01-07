package javabatch;

public class Method1 {
	static int a;
	int b;
	int c;
	
	public void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Method1 obj1 = new Method1();
		Method1 obj2 = new Method1();
		obj1.a = 5;
		obj1.b = 10;
		obj1.c = 15;
		
		obj1.addition(obj1.a, obj2.b, obj2.c);
		
		System.out.println("--------------------------------");
		
		
		obj2.addition(obj2.a, obj1.b, obj1.c);
	}

}

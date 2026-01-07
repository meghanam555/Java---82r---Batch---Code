package javabatch;

public class MethodAccess {

	public static void StaticMethod1() {
		System.out.println("StaticMethod1");
//		StaticMethod2();
	}
	public static void StaticMethod2() {
		System.out.println("StaticMethod2");
		MethodAccess obj3 = new MethodAccess();
		obj3 .NonStaticMethod2();
	}
	public void NonStaticMethod1() {
		System.out.println("NonStaticMethod1");
//		StaticMethod2();
		NonStaticMethod2();
	}
	public void NonStaticMethod2() {
		System.out.println("NonStaticMethod2");
	}
	
	public static void main(String[] args) {
//		MethodAccess.StaticMethod1();
//		MethodAccess obj1 = new MethodAccess();
//		obj1.NonStaticMethod1();
//		MethodAccess obj2 = new MethodAccess();
//		obj2.NonStaticMethod1();
//		StaticMethod2();


	}

}

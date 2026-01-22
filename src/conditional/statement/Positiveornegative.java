package conditional.statement;

public class Positiveornegative {
	public static void number(int a) {
		if(a>=0) {
			System.out.println(a + " is positive number");
		}
		else{
			System.out.println(a + " is negative number");
		}
	}
	public static void main(String[] args) {
		number(-20);

	}

}

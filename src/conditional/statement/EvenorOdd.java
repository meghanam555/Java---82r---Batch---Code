package conditional.statement;

public class EvenorOdd {
	public static void oddoreven(int num) {
		if(num%2==0) {
			System.out.println( num + " is an even number ");
		}
		else {
			System.out.println( num + "is an odd number");
		}
	}
	public static void main(String[] args) {
		oddoreven(20);

	}

}

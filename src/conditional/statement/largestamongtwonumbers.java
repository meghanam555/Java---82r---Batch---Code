package conditional.statement;

public class largestamongtwonumbers {
	public static void largestnum(int a, int b) {
		if(a>b) {
			System.out.println(a + " is largest number");
		}
		else {
			System.out.println(b + " is largest number");
		}
	}
	public static void main(String[] args) {
		largestamongtwonumbers.largestnum(34, 42);
	}

}

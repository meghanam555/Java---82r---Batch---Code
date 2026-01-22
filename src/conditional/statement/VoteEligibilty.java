package conditional.statement;

public class VoteEligibilty {

	public static void main(String[] args) {
		int age = 16;
//		System.out.println("main starts");
		if(age>=18) {
			System.out.println("The person with the age " + age + " is Eligibe to Vote");
		}	
		else {
			System.out.println("The person with the age " + age + " is not Eligible to vote");
		}
//	System.out.println("main ends");

	}

}

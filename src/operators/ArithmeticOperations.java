package operators;

public class ArithmeticOperations {

	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 22;
//		
//		// Arithmetic Operations
//		int result = num1 + num2;
//		
//		System.out.println("Addition of " + num1 + " and "+  num2 + " is " + result);
//		System.out.println("Subtraction " + ( num1 - num2));
//		System.out.println("Multiplication :" +(num1*num2) );
//		System.out.println("Division :" + (num1/num2)); 
//		System.out.println("Remainder: " +(num1%num2)); 
		
		// Real World Example
		
		int price = 1200;
		int quantity = 3;
		int discount = 500;
		
		int totalprice = price*quantity;
		System.out.println("The Actual Price of the 3 Shirt is " +totalprice);
		int afterdiscount = totalprice - discount;
		System.out.println("The Price of the 3 shirts after discount is : " +afterdiscount);
		int installment = totalprice/3;
		System.out.println("Per month as per the Installment, u should pay : " +installment);
		int tax1 = 100;
		int tax = afterdiscount + tax1;
		System.out.println("Afer the tax , the total price of the shirt: " +tax);
		int remainingamount = afterdiscount % 1000;
		System.out.println("Remaining amount: " +remainingamount );
		System.out.println();
		System.out.println("*****************************************");
		System.out.println();
		/// Comparison Operator //
		boolean discountapplied = discount>0;
		System.out.println("The Discount present on the Shirt is : " +discountapplied);
		boolean pricefullypaid = afterdiscount == 3000;
		System.out.println("The man paid full price : " +pricefullypaid);
		boolean highorder = quantity>=3;
		System.out.println("High Order, discount applied :" +highorder);
		boolean loworder = totalprice <= 2000;
		System.out.println("He ordered less Clothes :" +loworder);
		boolean pricechanged = !(totalprice== afterdiscount);
		System.out.println(pricechanged);

		
		
		
		
		
		
		
//		
//		int a = 10;
//		int b = 20;
//		boolean res = a>b;
//		System.out.println(a + ">" +  b + ": " + res);
//		System.out.println(a + "<" + b + " : " + (a<b));
//		System.out.println(a==b);
//		System.out.println(a>=b);
//		System.out.println(a<=b);
//		System.out.println(10<=10);
//		System.out.println(!(a==b));

	}

}

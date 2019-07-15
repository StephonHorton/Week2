package Day6;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		
		int stan = 10;
		int dave = 5;
		int gwen = 15;
		int name = 0;
		
		double stacey = 2.5;
		double back = 6.9;
		double straight = 1.1;
		
		
		System.out.println("Welcome to the wrong calculator");
		System.out.println("Enter a number");
		stan = user.nextInt();
		System.out.println("Enter another number");
		dave = user.nextInt();
		
		
		
		gwen = stan + dave;
		
		System.out.println("Your answer is  " +gwen);
		
		System.out.println("This is the difference");
		
		gwen = stan - dave;
		
		System.out.println("Your answer is  " + gwen);
		
System.out.println("This is the product");
		
		gwen = stan * dave;
		
		System.out.println("Your answer is  " +gwen);
		
System.out.println("This is the quotient");
		
		gwen = stan / dave;
		
		System.out.println("Your answer is  " +gwen);
		
		
		
		
		System.out.println("Enter a Decimal");
		stacey = user.nextDouble();
		System.out.println("Enter another Decimal");
		straight = user.nextDouble();
		
		back = stacey + straight;
		
		System.out.println(back);
		
		System.out.println("The difference is");
		
		back = stacey - straight;
		
		System.out.println(back);
		
		System.out.println(" the product is ");
		
		back = stacey * straight;
		System.out.println(back);
		
		System.out.println("the quotient is ");
		
		back = stacey / straight;
		System.out.println(back);
		
		
		
		user.close();
		
		

	}

}

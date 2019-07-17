package day7;
import java.util.Scanner;
public class TheDubs {

	public static void main(String[] args) {
		Scanner code = new Scanner(System.in);
		
		int bye = 7;
		int hi = 10;
		int back = 0;
		String name = "";
		String color = "";
		int neat =  9;
		int meat = 2;
		int neck = 3;
		
		
		
		System.out.println("Welcome to Dubs calculator");
		System.out.println("Enter your name");
		name = code.next();
		System.out.println("Enter your favorite color");
		color = code.next();
		System.out.println("Enter your first number");
		bye = code.nextInt();
		System.out.println("Enter another number");
		back = code.nextInt();
		
		hi = bye + back;
		System.out.println("The sum of your two numbers is "+hi);
		
		hi = bye - back;
		System.out.println("The difference of your two numbers is "+hi);
		
		hi = bye * back;
		System.out.println("The product of your two numbers is "+hi);
		
		hi = bye / back;
		System.out.println("The quotient of your two numbers is "+ hi);
		System.out.println();
		System.out.println("From my understanding,your name is " + name  );
		System.out.println("and your favorite color is " + color  );
		System.out.println();
		System.out.println("Please rate your experience on a scale of 1 to 10. ");
		neat = code.nextInt();
		
		 if (neat>= neck ){
				System.out.println("Thank you for using our calculator");  
		    } else if (neat< neck ){ System.out.println("We apologize for the inconvience " + name);
			 
		 System.out.println("Thank you for using our calculator"); 
			 
		 }
		
	
		
		
	code.close();

	}

}

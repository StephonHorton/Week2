package day7;
import java.util.Scanner;
public class warmUp {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		String name = "";
		int number = 0;
		int numero = 12;
		int answer = 1;
		
		
		System.out.println("Enter your name");
		name = user.next();
		System.out.println("Enter you first number");
		number = user.nextInt();
		System.out.println("Enter your second number");
		numero = user.nextInt();
		
		System.out.println("Hello  " + name +"  here are your answers");
		System.out.println("Addition");
		answer = number + numero;
		System.out.println(answer);
		System.out.println("Subtraction");
				answer = number - numero;
				System.out.println(answer);
				System.out.println("Multiplication");
				answer = number * numero;
				System.out.println(answer);
				System.out.println("Division");
				answer = number / numero;
		System.out.println(answer);
		
		
		System.out.println("Thank you for your participation " + name + " hope to see you soon");
		
		
		
		user.close();
		
		
		

	}

}

package Tasks;

import java.util.Scanner;

public class DayTwoTasks {

	public static void main(String[] args) {
		
	//1) Ask user to input two numbers, compare them and output result:
		
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Enter value a:");
		
		int first = scan.nextInt();
		
		System.out.println("Enter value b:");
		
		int second = scan.nextInt();
		scan.close();
		System.out.printf("is "+first+" equal to "+second+"? - %b%n",first == second);
		System.out.printf("is "+first+" less than "+second+"? - %b%n",first < second);
		System.out.printf("is "+first+" less or equal to "+second+"? -%b%n",first <= second);
		System.out.printf("is "+first+" greater than "+second+"? -%b%n",first > second);
		System.out.printf("is "+first+" greater or equal to "+second+"? -%b%n",first >= second);
		
		*/
	//2) Ask user to input two boolean values and compare them.
		/*
		System.out.println("Enter b1:");
		
		boolean b1 = scan.nextBoolean();
		
		System.out.println("Enter b2:");
		
		boolean b2 = scan.nextBoolean();
		scan.close();
		
		System.out.printf("is b1 and b2 equal? - %b%n",b1 == b2);
		*/
		
	//3) Ask user to input a whole number and output true, if it is even number 
	//and false if it is odd number
		/*
		System.out.println("Input a whole number");
		int number = scan.nextInt();
		scan.close();
		String result = (number % 2 == 0) ? "true" : "false";
		System.out.println(result);
		*/
	//4) Ask user to input a whole number and output false, if it is
	//even number and true if it is odd number	
		/*
		System.out.println("Input a whole number");
		int number2 = scan.nextInt();
		scan.close();
		String result2 = (number2 % 2 != 0) ? "true" : "false";
		System.out.println(result2);
		*/
	//5) Write a program which reads boolean value from user 
	//and prints out the opposite value:
		/*
		System.out.println("Enter boolean value");
		boolean answer2 = scan.nextBoolean();
		scan.close();
		String result2 = (answer2 == true) ? "Opposite of true is false" : "Opposite of false is true";
		System.out.println(result2);
		*/
	//6) Write a program which asks the user to input two whole numbers a and b.
	//Output "true", if one of this condition is true:
		System.out.println("input two whole numbers");
		System.out.println("A: ");
		int a = scan.nextInt();
		System.out.println("B: ");
		int b = scan.nextInt();
		scan.close();
		if(a == b || (a < 0 && b > 0) || (a > 100 && b > 100)) {
			System.out.println("a is "+a+" and b is "+b+" ->true");

		}else {
			System.out.println("a is "+a+" and b is "+b+" ->false");
		}
	}
}

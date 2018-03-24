package lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter some number");
		int x = scan.nextInt();
		System.out.println("The entered value is");
		System.out.print(x);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter some double value");
		double y = scan1.nextDouble();
		System.out.println("The entered value is");
		System.out.print(y);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter some string");
		String a = scan2.nextLine();
		System.out.println("The entered string is");
		System.out.print(a);
		
		
		
		
		

	}

}

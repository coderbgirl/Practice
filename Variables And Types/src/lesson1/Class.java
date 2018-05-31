
package lesson1;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = scan.nextInt();
		
		//Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the value of b");
		int b = scan.nextInt();
		
		//Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the value of c");
		int c = scan.nextInt();
		
		System.out.println("a="+a+",b="+b+",c="+c+",a+bc="+ (a+(b*c)));
		
	}

}

package lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int a= scan.nextInt();
	

		
		for(int i=0; i<a; i++){
			
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
				
			System.out.println("");
		}

	}

}

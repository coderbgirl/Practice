package lesson1;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int x= scan.nextInt();
		 
		if(x >10){
			System.out.println("Entered value is grater than 10");
		}
		else{
			System.out.println("Entered number is less than 10");
		}
	}

}

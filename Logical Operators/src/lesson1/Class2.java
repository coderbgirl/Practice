package lesson1;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of sub1");
		int sub1 = scan.nextInt();		
	
		
		System.out.println("Enter value of sub2");
		int sub2 = scan.nextInt();
		
		if((sub1>= 35) || (sub2 >= 40)){
			System.out.println("Condition is true");
		}
		else{
			System.out.println("Condition is false");
			
		}

	}




	}



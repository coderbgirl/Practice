package lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the score");
		int score = scan.nextInt();
	
		switch(score)
		{
		case 90 :
		System.out.println("very good");
		break;
		
		case 70 :
		System.out.println("good");
		break;
			
		case  60 :
		System.out.println("ok");
		break;
		
		default:
		System.out.println("Not defined");
		break;
			
			
		}

	}

}

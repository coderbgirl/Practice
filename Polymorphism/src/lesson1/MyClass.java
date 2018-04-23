package lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Bank abc= new Bank_ABC();
		Bank def= new Bank_DEF();
		Bank xyz= new Bank_XYZ();
		
		System.out.println(abc.getInterestRate());
		System.out.println(def.getInterestRate());
		System.out.println(xyz.getInterestRate());*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the age:");
		int a= scan.nextInt();
		
		Member mem1= new Member(a);
		System.out.println(mem1.getType());
		

		

	}

}

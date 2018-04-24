package lesson1;

import java.util.Scanner;
import java.lang.Math;

public class ABC_3 {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			// TODO Auto-generated method stub


		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number:");
		int a= scan.nextInt();

		for(int i=0; i<a; i++) {			
			
			for(int p=Math.abs(a/2-i); (p< a/2); p++) {
				
				System.out.print(" ");
			}

			for(int j=-Math.abs(a/2-i); j<=Math.abs(a/2-i); j++) {
								
				System.out.print((char) ('A' + Math.abs(Math.abs(j)-Math.abs(a/2-i))));
			}

		System.out.println("");

	}

	}



}

package lesson1;

import java.util.Scanner;

public class ABC_2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the number:");
	int a= scan.nextInt();

	for(int i=0; i<a; i++){
		int q;
		int k;
		
		
		for(int p=a/2-i; (p< a/2) && (i<a/2); p++){
			
			System.out.print(" ");
		}

		for(q=0; (q<=a/2-i) && (i<a/2); q++){
			
			System.out.print((char) ('A'+q));
		}
		
		for(int r=0; (r<a/2-i) && (i<a/2); r++){
			
			System.out.print((char) ('A' + q-2-r));
		}
		
		for(int j=0; j<a-i-1; j++){

			System.out.print(" ");}


		for( k=0; (k<=i-a/2) && (i>=a/2); k++){

			System.out.print((char) ('A'+k));
		}

		for(int l=0; (l<i-a/2) && (i>=a/2); l++){


			System.out.print((char) ('A'+k-2-l));
		}

	System.out.println("");

}

}}



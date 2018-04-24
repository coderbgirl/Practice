package lesson1;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number:");
		int a= scan.nextInt();
		
			


		   for(int i=0; i<a; i++){
			   
				for(int j=0; j<a-i-1; j++){

					System.out.print(" ");}

			
			  for(int k=0; k<2*i+1; k++){
				  

					System.out.print("*"); 
			  }
			  

	                  System.out.println("");

	

		}

	}
		
	}



	



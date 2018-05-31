package lesson1;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int a=0;
		
		while( a<= -1)
		{
			System.out.println(a);
			a++;

	}


 System.out.println("--------------");
 
 int b=0;
 do{
	 System.out.println(b);
	 b++;
 }
while(b<= -1);*/
	
Scanner scanner= new Scanner(System.in);

int value=0;
do{
	System.out.println("Enter the number");
	value= scanner.nextInt();
}
	while(value !=5);
		System.out.println("got 5");
	}
	
	
}
	


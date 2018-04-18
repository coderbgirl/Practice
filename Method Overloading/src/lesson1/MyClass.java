package lesson1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(add(1,67));
		System.out.println(add(2.5645, 5.54645));
		System.out.println(add("abc", "pqr"));
	}
		
		public static int add (int a, int b){			
			return (a+b);
			
		}
		
		public static double add (double a, double b){
			return (a+b);
			
		}
		
		public static String add(String a, String b){
			return (a+b);
			
		}
	
		
	}



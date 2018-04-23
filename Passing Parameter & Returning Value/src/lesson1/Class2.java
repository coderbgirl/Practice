package lesson1;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=5;
		add(1,2,3);
		int result= sum*10;
		System.out.println(result);
		
		}

	public static int add(int a, int b, int c){
		int r;
		a+=5;
		b+=5;
		c+=10;
		r=a+b+c;
		System.out.println(r);
		return(r+5);
	}

	}



package lesson1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10, y = 12, z = 15;
		x++;
		System.out.println(x);
		System.out.println(y++);
		//System.out.println(y);
		System.out.println(y + y++ + y++ + y);
		System.out.println(y);
		System.out.println(++z);
		System.out.println(z);
		
		int a = 10, b = 12, c =15;
		a += 5;
		b -= 5;
		c *= 5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}

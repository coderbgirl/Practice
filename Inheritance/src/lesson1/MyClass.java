package lesson1;

import lesson2.Triangle;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect= new Rectangle();
		Triangle tri = new Triangle();
		
		rect.set_values(10,10);
		tri.set_values(10, 10);
		
		System.out.println("Area of rectangle ="+rect.area());
		System.out.println("Area of triangle ="+tri.area());

		
		
	}

}
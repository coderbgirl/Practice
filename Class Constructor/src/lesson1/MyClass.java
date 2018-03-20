package lesson1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Cube cube1= new Cube();
		System.out.println(cube1.getvolume());
		System.out.println(cube1.getarea());
		
		Cube cube2= new Cube(20,30,10);
		System.out.println(cube2.getvolume());
		System.out.println(cube2.getarea());
		
		Cube cube3 = new Cube(3,4,5);
		System.out.println(cube3.getvolume());
		System.out.println(cube3.getarea());
	}

}

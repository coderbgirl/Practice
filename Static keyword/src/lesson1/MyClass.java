package lesson1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello hello= new Hello();
		hello.age=10;
		System.out.println(hello.age);
		
		hello.dosomething("Hello Youtube");
		hello.dosomethingelse("Hi There");
		
		Hello hello1= new Hello();
		hello1.age=50;
		System.out.println(hello1.age);
	}

}

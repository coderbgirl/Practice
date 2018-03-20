package lesson1;

public class MyClass {

	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
	
	//Student as array
	Student blue_room[]= new Student[20];	
	blue_room[0].id=1;
	blue_room[0].name="Daniel";
	blue_room[0].age=5;
	
	blue_room[1].id=2;
	blue_room[1].name="Kyra";
	blue_room[1].age=3;
	
	blue_room[2].id=3;
	blue_room[2].name="Veronica";
	blue_room[2].age=4;
		
	
	//Student as single object
	Student mark = new Student();
	mark.id=1;
	mark.name="Mark";
	mark.age=15;
	
	System.out.println(mark.name + " is " + mark.age + " years old.");
	
	
  Student tom= new Student();
	tom.id=2;
	tom.name="Tom";
	tom.age=14;
	
	System.out.println(tom.name + " is " + tom.age + " years old.");

	}

}

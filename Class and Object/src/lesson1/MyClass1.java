package lesson1;

public class MyClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 mark= new Student1();
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(15);
		 
		System.out.println(mark.getName()+" is "+mark.getAge()+" years old. ");
		
		
		Student1 tom= new Student1();
		tom.setId(2);
		tom.setName("Tom");
		tom.setAge(16);
		 
		System.out.println(tom.getName()+" is "+tom.getAge()+" years old. ");

	}

}

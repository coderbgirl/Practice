package lesson1;

public class Student {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	/*this pointer is a reference to the current object (in this case "stu") that is calling the function 
	or is currently being executed.*/
	public void setName(String var) {
		name = var;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}

package lesson1;

public class Member {
	protected String name;
	protected int age;
	protected String type;
	
	public Member (int a) {
		age = a;
	if (a>20) type = "Teacher";
	else type = "Student";
	}
	
	public String getType(){
		return type;
	}
}

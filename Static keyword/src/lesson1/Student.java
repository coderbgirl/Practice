package lesson1;

public class Student {
	int age;
	String name;
	static int noofstudents = 0;
	Student(){
	noofstudents ++ ;
	}
	
public static int getnoofstudents(){
	return noofstudents;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}

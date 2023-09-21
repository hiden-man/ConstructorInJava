package ConstructorInJava;

public class SecondClass {
	public int age;
	public String name;
	public SecondClass(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String Message() {
		return age + ", " + name;
	}
}

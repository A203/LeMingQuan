package day3;

public class this01 {
	public static void main(String[] args) {
		Person1 person = new Person1();
	}
}

class Person1 {
	String name;
	int age;
	String address;

	public Person1() {
	}

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public Person1(String name, int age, String address) {
		this(name, age);
		this.address = address;
	}

	void hello() {
		System.out.println("hello ...");
	}

	void introduce() {
		System.out.println("name:" + this.name + "\tage:" + this.age
				+ "\taddress:" + this.address);
		this.hello();

	}
}

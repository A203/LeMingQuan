package day3;

public class shili2 {
	public static void main(String[] args) {
		Person3 p = new Person3(20);
		System.out.println(p.age);
	}
}

class Person3 {
	int age;

	Person3(int age) {
		this.age = age;
	}

	{
		age = 18;
	}

}
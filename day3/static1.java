package day3;

public class static1 {

	int age;

	void hello() {
		System.out.println("hello...");
	}

	static String name = "уехЩ";

	static void hi() {
		System.out.println("hi..");
	}

	public static void main(String[] args) {
		static1 d = new static1();
		// d.age=10;
		// d.hello();
		System.out.println(static1.name);
		static1.hi();
		d.hi();
	}
}

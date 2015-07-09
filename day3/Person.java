package day3;

public class Person {

	String name;
	int age;
	String address;

	// 无参构造方法
	// 有参构造方法

	void introduce() {
		System.out.println("大家好,我叫" + name + "今年" + "age" + "岁了,我在" + address);
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "张三";
		person.age = 20;
		person.address = "USA";

		person.introduce();

	}

}

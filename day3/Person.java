package day3;

public class Person {

	String name;
	int age;
	String address;

	// �޲ι��췽��
	// �вι��췽��

	void introduce() {
		System.out.println("��Һ�,�ҽ�" + name + "����" + "age" + "����,����" + address);
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "����";
		person.age = 20;
		person.address = "USA";

		person.introduce();

	}

}

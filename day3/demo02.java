package day3;

public class demo02 {
	String name;
	String brand;
	int price;

	void call() {
		System.out.println("��绰");
	}

	void sendMsg() {
		System.out.print("������");
	}

	public static void main(String[] args) {
		demo02 p = new demo02();

		p.name = "note";
		p.brand = "���׻�";
		p.price = 99;

		System.out.println(p.name);
		System.out.println(p.brand);
		p.sendMsg();

	}

}

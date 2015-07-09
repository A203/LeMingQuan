package day3;

public class demo02 {
	String name;
	String brand;
	int price;

	void call() {
		System.out.println("打电话");
	}

	void sendMsg() {
		System.out.print("发短信");
	}

	public static void main(String[] args) {
		demo02 p = new demo02();

		p.name = "note";
		p.brand = "爆米花";
		p.price = 99;

		System.out.println(p.name);
		System.out.println(p.brand);
		p.sendMsg();

	}

}

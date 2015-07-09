package day3;

//编写学生类,拥有学号,姓名,家庭住址,自我介绍行为,实例化对象
public class demo03 {
	String number;
	String name;
	String address;

	void expression() {
		System.out.println("自我介绍");
	}

	public static void main(String[] args) {
		demo03 p = new demo03();

		p.number = "1000";
		p.name = "lmq";
		p.address = "hf";
		System.out.println(p.name);
		p.expression();
	}
}

package day3;

public class shili3 {
	public static void main(String[] args) {
		System.out.println(C.instance.num2);
		System.out.println(new C(1).num2);
	}

}

class C {
	static C instance = new C(1);
	static int num1 = 5;
	int num2;

	C(int num3) {
		num2 = num1 - num3;
	}
}
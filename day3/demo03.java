package day3;

//��дѧ����,ӵ��ѧ��,����,��ͥסַ,���ҽ�����Ϊ,ʵ��������
public class demo03 {
	String number;
	String name;
	String address;

	void expression() {
		System.out.println("���ҽ���");
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

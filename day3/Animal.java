package day3;
//һ����������г��󷽷�,��������ǳ�����
public abstract class Animal {
//abstract���η�����ʾ��������ǳ��󷽷�
	public abstract void sleep();
}

    class Tiger extends Animal{

		@Override
		public void sleep() {
			// TODO Auto-generated method stub
			System.out.println("ſ��˯...");
		}
     }
    class Monkey extends Animal{
    	public void sleep(){
    		System.out.println("����˯...");
    	}
    }
    
    
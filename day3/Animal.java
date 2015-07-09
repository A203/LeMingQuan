package day3;
//一个类中如果有抽象方法,则这个类是抽象类
public abstract class Animal {
//abstract修饰方法表示这个方法是抽象方法
	public abstract void sleep();
}

    class Tiger extends Animal{

		@Override
		public void sleep() {
			// TODO Auto-generated method stub
			System.out.println("趴着睡...");
		}
     }
    class Monkey extends Animal{
    	public void sleep(){
    		System.out.println("仰着睡...");
    	}
    }
    
    
//package com.geminno.p2;
package com.geminno.p1;
import com.geminno.p1.A;


public class B {//extends A{
    public void methodB1(){
    	A a=new A();
    	//a.methodA1();
    	//a.methodA2();methodA2��˽�е�
    	//a.methodA3();default����ֻ����ͬһ�����е�����ܷ���
    	
    	
   // 	methodA4();
    	a.methodA4();
    	
    }
    
    public static void main(String[] args){
    	B b=new B();
    	b.methodB1();
    }
}

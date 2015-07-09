
public class exe03 {
   public static void main(String args[]){
     byte b=0;
     short s=0;
     int i=0;
     long l=1;
     float f=0;
     double d=0;
     //float f1=0.1;//可能损失精度
     float f1=0.1F;//正确
     //i=l;         //可能损失精度
     //int j=0.5*10;//可能损失精度
     double j=0.5*10;
     //byte k=b+0;//可能损失精度
     
     /* 1.整数字面量为整数(int);
      * 2.小数字面两为双精度(double);
      * 3.byte和short型可以直接用字面量赋值
      */
     byte k=(byte)(b+12);//强制类型转换
     //byte=(byte)(b+200);//越界,运行结果为-56
     System.out.println(k);
}
}

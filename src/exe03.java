
public class exe03 {
   public static void main(String args[]){
     byte b=0;
     short s=0;
     int i=0;
     long l=1;
     float f=0;
     double d=0;
     //float f1=0.1;//������ʧ����
     float f1=0.1F;//��ȷ
     //i=l;         //������ʧ����
     //int j=0.5*10;//������ʧ����
     double j=0.5*10;
     //byte k=b+0;//������ʧ����
     
     /* 1.����������Ϊ����(int);
      * 2.С��������Ϊ˫����(double);
      * 3.byte��short�Ϳ���ֱ������������ֵ
      */
     byte k=(byte)(b+12);//ǿ������ת��
     //byte=(byte)(b+200);//Խ��,���н��Ϊ-56
     System.out.println(k);
}
}

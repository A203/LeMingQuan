
public class zhishuge{
	public static void main(String[] args){
		int num=99;
		for(int i=2;i<=100;i++)
			{for(int j=2;j<=Math.sqrt(i);j++)
				if(i%j==0){
					num--;
					break;
					
				}
			}
		System.out.println("num:"+num);
	}
}


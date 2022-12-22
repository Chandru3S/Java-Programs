package logic;

public class Demo1 {

	public static void main(String[] args) {
		
		int sum=9,t,rem,a,b,c;
		for(int i=0;i<201;i++)
		{
			t=sum+i;
			rem=t%10;
			a=t/10;
			b=a%10;
			c=a/10;
			
			if(c<=b && b<=rem)
			{
				if(c+b+rem==sum)
				{
					System.out.println(t);
				}
			}
		}

	}

}

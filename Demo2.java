package logic;

public class Demo2 {

	public static void main(String[] args) {

		String s="Chandru";
		String s1=s;
		String s2="";
		
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		for(int i=1;i<s.length()-1;i++)
		{
			System.out.println(s.charAt(i)+"     "+s2.charAt(i));
		}
		System.out.println(s2);
	}

}

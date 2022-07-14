import java.util.*;
public class SwapAndAscii 
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String word");
		String str = sc.nextLine();
		sc.close();
		
		String []word =str.split("\\s");
		String rev ="";
		
		//Reverse/swap each word position
		for(int i=0;i<word.length;i++)
		{
			if(i==word.length-1)
			{
				rev=word[i]+rev;
			}
			else
			{
				rev=" "+word[i]+rev;
			}
		}
		System.out.println("Original string word :"+str);
		System.out.println("Reverse  string word :"+rev);
		
		String c =rev;
		//Ascii value and sum first word
		int sum=0, asciiValue;
		for(int i=0; i<c.length(); i++)
		{
			asciiValue = c.charAt(i);
     		if(c.charAt(i)==32)
			{
				break;
			}
			sum=sum+asciiValue;
			System.out.println("\n"+c.charAt(i) + "=" + asciiValue);
		}
		System.out.println("After swapping First word\nTotal Ascii Value :"+sum);
		//Ascii value and sum of second word
		int total=0;
		for(int i=0; i<str.length(); i++)
		{
			asciiValue = str.charAt(i);
			if(str.charAt(i)==32)
			{
				break;
			}		
			total=total+asciiValue;
			System.out.println("\n"+str.charAt(i) + "=" + asciiValue);
		}
		System.out.println("After swapping Second word\nTotal Ascii Value :"+total);
		
	}

}

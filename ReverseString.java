import java.util.Scanner;

class ReverseString
{
    public static void main(String[] args) {
        
        String word="" ,rev="";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        word =s.next();

        s.close();
        for(int i=word.length()-1;i>=0;i--)
        {
            rev=rev+word.charAt(i);
        }

        System.out.println("Original String: "+word);
        System.out.println("Reverse String : "+rev);

    }
}
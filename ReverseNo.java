import java.util.Scanner;

public class ReverseNo {
    
    public static void main(String[] args) {
        
        int n ,digit, revNo=0;

        Scanner s =new Scanner(System.in);
        System.out.println("Enter the Number");
        n = s.nextInt();
        s.close();
        // System.out.println(n);319
        
        while(n!=0)
        {
            digit=n%10;
            revNo=revNo*10+digit;
            n=n/10;
        }

        System.out.println(revNo);
    }
}

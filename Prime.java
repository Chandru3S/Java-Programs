import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        
        int a, count=0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        a =sc.nextInt();
        sc.close();

        for(int i=2;i<a;i++)
        {

        
            if(a%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Yes");
        }
        else{

            System.out.println("2");
        }

    }
    
}

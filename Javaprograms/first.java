import java.util.*;
public class first{
    public static void main(String args[])
    {
        int i,n,count=0;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            n= sc.nextInt();
        }
         for(i=1;i<=n;i++)
         {
            if(n%i==0)
            {
                count++;
            }
         }
         if(count==2)
         {
            System.out.println("the number is prime");

         }
         else
         {
            System.out.println("The number is not prime");

         }
         

    }
}
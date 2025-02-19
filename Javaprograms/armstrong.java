import java.util.*;
public class armstrong {
    public static void main(String args[])
    {
        int n,sum=0,rem,temp;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("armstrong");

        }
        else{
            System.out.println("not armstrong");
        }

        
    }
}

package algoprep;
import java.util.Scanner;

public class p1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int k=n-i;k>=0;k--)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            // for(int k=n-i;k>=0;k--)
            // {
            //     System.out.print(" ");
            // }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            //spaces
            for(int k=n-i;k>=0;k--)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=2*i-1;j>=1;j--)
            {
                System.out.print("*");
            }
            // for(int k=n-i;k>=0;k--)
            // {
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }
}

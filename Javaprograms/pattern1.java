import java.util.*;
public class pattern1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r,c,i,j;
        System.out.println("Enter the number of rows");
        r= sc.nextInt();
        System.out.println("enter the number of columns");
        c=sc.nextInt();
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                if(i==1 || i==r|| j==1||j==c)
                {
                    System.out.print("*"); 
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}

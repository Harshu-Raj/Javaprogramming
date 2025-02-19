import java.util.*;
public class even {
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        n= sc.nextInt();
        if(n%2==0)
        {
            System.out.println("The number is even");

        }
        else{
            System.out.println("The number is odd");
        }
        

    }
}

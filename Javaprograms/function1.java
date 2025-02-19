import java.util.*;
public class function1 {
    public static int sum(int a , int b){
        int sum= a+b;
        return sum;
    }
    public static void binary2dec(int n)
    {
        int pow=0;
        int mynum=n;
        int binarynum=0;
        while(n>0)
        {
            int rem=n%2;
            binarynum=binarynum+(rem* (int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println("binary num of "+ mynum+ " ="+binarynum);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        //System.out.println(sum(35,35));
        int pow=0;
        System.out.println("Enter any binary number:");
        int binary=sc.nextInt();
        int mynum=binary;
        int decnum=0;
        while(binary>0)
        {
            int lastdigit=binary%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binary=binary/10;

        }
        System.out.println("decimal of"+mynum+" ="+decnum);
        binary2dec(19);

        

    }
    
}

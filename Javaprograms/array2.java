import java.util.Scanner;

public class array2 {
    public static void swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("a="+a +" b="+b);
    }
    public static void main(String args[])
    {
        int a,b;
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        swap(a,b);
    }
}

import java.util.*;

public class fun {
    public static void fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        for (int i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
           
           
            System.out.println(c);

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        fib(n);

    }
}

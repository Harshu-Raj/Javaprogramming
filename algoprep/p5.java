package algoprep;
import java.util.*;
public class p5{
    public static void main(String args[]){
        // sum(10);

        // int factorial=factorial(5);
        // System.out.println("The factorial of 5 is:"+factorial);
        int fibonaaci=fibo(10);
        System.out.println("The fibonacci series is:"+fibonaaci);
    }



public static void sum(int n){
    if(n==1)
    {
        System.out.println(1);
        return;
    }
    sum(n-1);
    System.out.println(n);
    

}

public static int factorial(int n){
    if(n==1)
    {
        return n;
    }
    int temp=factorial(n-1);
    return temp*n;


}
public static int fibo(int n){
    if(n==0)
    {
        return 0;
    }
    if(n==1)
    {
        return 1;


    }
    int temp=fibo(n-1)+fibo(n-2);
    return temp;
}
}
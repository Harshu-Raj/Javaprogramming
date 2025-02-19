import java.util.*;
public class swap{
    public static void main(String args[])
    {
        int arr[]=new int[10];
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int x=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
            // System.out.println("\n");
        }
       
        // System.out.println("Enter two indices to swap:");
        // int n=0;
 
        // System.out.println(n);
        swap(arr,x);
        for(int i=0;i<x;i++)
        {
            System.out.println(arr[i]);
        }
        
       

        
    }
    public static void swap(int arr[],int x )

    {
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the two indices from where the array has to be reversed:");
      int lo=sc.nextInt();
      int hi=sc.nextInt();

       while(lo<hi)
       {
        int temp=arr[lo];
        arr[lo]=arr[hi];
        arr[hi]=temp;
        lo++;
        hi--;
       }
       
       
    }
}
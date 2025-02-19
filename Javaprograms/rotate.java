import java.util.*;
public class rotate {
 public static void main(String args[])   
 {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[10];
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    System.out.println("Enter the elements of the array:");
    for(int i =0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the value of k:");
    int k=sc.nextInt();
    reverse(arr,n,0,n-1);
    reverse(arr,n,0,k-1);
    reverse(arr,n,k,n-1);
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]);
    }

   
    

 }
 public static void reverse(int arr[],int x,int lo,int hi )

    {
    //     Scanner sc=new Scanner(System.in);
    //   System.out.println("Enter the two indices from where the array has to be reversed:");
    //   int lo=sc.nextInt();
    //   int hi=sc.nextInt();

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

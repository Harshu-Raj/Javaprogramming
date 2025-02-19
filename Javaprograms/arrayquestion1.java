import java.util.*;


public class arrayquestion1 {
    public static int binarysearching(int key,int n,int array[]){
        int i,start,mid,end;
        start=0;
        end=n;
        while(end>=start)
        {
            mid=(start+end)/2;
            if(key==array[mid])
            {
                return mid;

            }else if(key>array[mid])
            {
            start=mid+1;

            }
            else{
                end=mid-1;
            }
            
        }
        return -1;

    }
    public static void main(String args[]){
       

     Scanner sc=new Scanner(System.in);
     int array[]=new int[100];
     System.out.println("Enter the size of the array:");
     int n=sc.nextInt();
     System.out.println("enter an sorted array:");
     for(int i=0;i<n;i++)
     {
        System.out.printf("a[%d]=",i);
         array[i]=sc.nextInt();
     }
    System.out.println("Enter the key element:");
    int key=sc.nextInt();
    System.out.printf("the element %d is found at %d",key,binarysearching(key, n, array));

     
    }
}

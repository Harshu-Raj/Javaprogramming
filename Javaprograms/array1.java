import java.util.*;
public class array1 {
    public static void main(String args[]){
        int n;
        int sum=0;
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {

            marks[i]=sc.nextInt();

        }
        for(int i =n-1;i>=0;i--)
        {
            sum=sum+marks[i];
        }
        System.out.println(sum);
        
        
    }
}

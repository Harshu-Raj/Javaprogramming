import java.util.*;
public class linearsearching {
    public static void main(String args[])
    {
        int array[]=new int[100];
        int found=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
      
        for(int i=0;i<n;i++)
        {
            System.out.printf("array[%d]=" ,i);
            array[i]=sc.nextInt();

        }
        System.out.print("Enter the element to be searched=");
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(key==array[i])
            {
                System.out.printf("element %d is found at %d",key,i);
                found=1;

            }
        }
        if(found!=1){
            System.out.println("Not found");

        }
        
    }
}

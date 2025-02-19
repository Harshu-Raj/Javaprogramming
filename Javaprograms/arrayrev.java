import java.util.*;
public class arrayrev {

    public static void revarray(int array[]){
        for(int j=array.length-1;j>=0;j--)
        {
            System.out.print(array[j]);
        }
        
    }
   public static void main(String args[]){
       
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int array[]=new int[n];
       for(int i=0;i<array.length;i++)
       {
           array[i]=sc.nextInt();
           
                  }
        revarray(array);
                  
       
   }

       
}



import java.util.*;

public class fibonacci {
    public static void main (String args[])
    {
        int a,b,c,i,n;
        
        a=0;b=1;
        c=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(a);
       for(i=1;i<=n;i++)
        {
           a=b;
           b=c;
           c=a+b;
           
         
           System.out.println(c );  
        }
        
       
            
        


    }

}

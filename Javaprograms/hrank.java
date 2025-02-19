import java.util.*;
public class hrank {
    public static void main(String args[])
    {
        int result=0;
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                
            result= result+(a+(int)Math.pow(2, i)*b);
           
                
                System.out.print(result+" ");
        
            }
           
        }
       
    }
}

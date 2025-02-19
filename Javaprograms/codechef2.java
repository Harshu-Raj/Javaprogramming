import java.util.*;
public class codechef2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int a=x*2;
		    int b=y*5;
		    if(a>b)
		   {
		       System.out.println("chocolates");
		   }
		   else if(b>a)
		   {
		       System.out.println("candy");
		   }
		   else{
		       System.out.println("either");
		   }
		}
    }
}

import java.util.Scanner;

public class discount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int have=x*5+y*10;
            int total=have/z;
            System.out.println(total);
            
        }
    }
}

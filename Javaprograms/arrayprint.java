import java.util.*;
public class arrayprint {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
       // System.out.println(Arrays.toString(array));
       for(int a:array){
        System.out.print(a+" ");
       }

    }
}

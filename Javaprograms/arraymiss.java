import java.util.*;
public class arraymiss {
   
    public static void main(String args[]){
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
        }
//System.out.println(missingarray(a[],n));
int k=missingarray(a[],n);
        
    }
     int  missingarray(int a[],int n){
        int i=0;
        while(a[i]!=i){
            //return (i);
            i++;
        }
        return i;
    }
}


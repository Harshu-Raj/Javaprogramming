import java.util.*;
public class largest {
    public static int getlargest(int array[] ){
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(lar<array[i]){
                lar=array[i];
            }
            else{
                
            }
        
        }
        return lar;
    }

    public static void main(String args[]){   
       int array[]=new int[5];
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<array.length;i++){
            System.out.printf("array[%d]=",i);;
            array[i]=sc.nextInt();


        }
        System.out.println("The largest number is :"+ getlargest(array));

    }
    
}

import java.util.*;


public class binary {
    public static void binarysearching(int numbers[],int key){
        int first=0;
        int last=numbers.length-1;
        while(first<=last){
            int mid=(first+last)/2;
          if(key==numbers[mid]){
            System.out.println("Element is found at "+mid);
            break;
          }
          if(key>numbers[mid]){
            first=mid+1;


          }
          else{
            last=mid-1;
          }
           

        }
       System.out.println("element does not exists.....");
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int numbers[]=new int[n];
       
        for(int i=0;i<n;i++){
            System.out.printf("numbers[%d]",i);
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        int key=sc.nextInt();
        binarysearching(numbers, key);

    }
    
}

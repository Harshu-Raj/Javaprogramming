import java.util.*;
public class linearsearch{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int i=0;
int f=0;
int array[]=new int[50];
System.out.println("Enter the size of the array:");
int n=sc.nextInt();
System.out.println("Enter the elements of the array:");
for(i=0;i<n;i++){
    System.out.printf("array[%d]:",i);
array[i]=sc.nextInt();
}
System.out.println("Enter the element to be searched");
int key=sc.nextInt();
for (i=0;i<n;i++){
    if(key==array[i]){
        System.out.println("the element is found at:"+i);
    }
   
}
if(f!=0){
    System.out.println("Not found!\n Please enter a valid element.....");
}
}
}



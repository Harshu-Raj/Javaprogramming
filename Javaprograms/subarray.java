import java.util.*;

public class subarray {
    public static void printsubarray(int numbers[]) {
       
        int sum = 0;
        int maxsum=Integer.MIN_VALUE;
       
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + numbers[k];
                }
                System.out.printf("the sum of subarrays is %d", sum);
                if(maxsum<sum)
                {
                    maxsum=sum;
                }
               
            }
           
        }
        System.out.println(maxsum);
    }

    public static void main(String args[])

    {
        int numbers[] =new int[5];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();

        }
        printsubarray(numbers);
    }

}

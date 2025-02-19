public class bs
{
    public static void main(String args[])
    {
        int[] arr={5,6,7,8,32, 34,35,75};
        int target=34;
       System.out.println( binarysearch(arr, target));


    }
    static int binarysearch(int[] arr,int target)
{
    int start=0;
    int end=arr.length-1;
    boolean isas=arr[start]<arr[end];
    while(start<=end)
    {
        int mid=start+ (end-start)/2;
        if(target== arr[mid])
        {
            return mid;

        }
           if(isas)
           {
                     if(target<arr[mid])
                     {
                      end=mid-1;
                     }
                     else
                     {
                        start=mid+1;
                    }
            }
        else
        {
            if(target>arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
    }
    return -1;

}
}
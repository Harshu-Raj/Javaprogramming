class Rotate{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        rotate(arr,k);
    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }

    }
    public static int [] reverse(int nums[],int s,int e)
    {
        while(e>s){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
        }
        return nums;
    }
}
public class prefix 
{
    public static void main(String[] args) {
        int arr[]={12,412,1,45,51};
        int prefixmax[]=prefix(arr);
        int suffixmin[]=suffix(arr);
        for(int i=0;i<arr.length;i++)
        System.err.println(prefixmax[i]);
        
        
        for(int i=0;i<arr.length;i++)
        System.err.println(suffixmin[i]);
        
        }
    
    public static int [] prefix(int arr[]){
        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            pre[i] = Math.max(pre[i - 1], arr[i]);
        }
        return pre;
    }
    public static int[] suffix(int arr[])
    {
        int suff[]=new int[arr.length];
        suff[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            suff[i]=Math.min(suff[i+1],arr[i]);
        }
        return suff;
    }
    
}


public class floor {
    public static void main(String args[]){
        int array[]={1,4,6,7,14,15,22,24,33};
        int target=12;
        System.out.println(celno(array, target));
    }
    static int celno(int array[],int target)
    {
        int start=0;
        int end=array.length;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(target==array[mid]){
                return mid;
            }
            if(target>array[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return array[end];
    }
}

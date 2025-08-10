import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class hashmap {
    public static void main(String[] args) {
        int arr[]={2,5,3,6,7};
        List<Integer>list=new ArrayList<>();
        list=frequencyCount(arr);

    }
    public static List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
         int n = arr.length;
       HashMap<Integer,Integer>map=new HashMap<>();

       for(int i=0;i<arr.length;i++){
          if(map.containsKey(arr[i])==false){
            map.put(arr[i], 1);
          } 
        else{
            int temp=map.get(arr[i]);
            map.put(arr[i],temp+1);
        }}
     List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) { 
          if(map.containsKey(i)==false){
            result.add(0);
          }
          else{
            result.add(map.get(arr[i]));
          }
            }
   return result;
        }
}

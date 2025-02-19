import java.util.*;
public class stringbuilder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s ="Hello world";
   HashMap<Character,Integer>map=new HashMap<>();
   for(int i=0;i<s.length();i++)
   {
    //check wheather the key is present or not
    if(map.containsKey(s.charAt(i)))
    {
        int old_freq=map.get(s.charAt(i));
        map.put(s.charAt(i),old_freq+1);
    }
    else{
        map.put(s.charAt(i),1);
    }

   }
   
  
   System.out.println(map.get('h'));

   
    }
}

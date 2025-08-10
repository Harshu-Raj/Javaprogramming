import java.util.ArrayList;

class Gcd
{
    public static void main(String args[]){
       
       ArrayList<Long>list2=new ArrayList<>();
       list2=factorialNumbers(1);
       for(int i=0;i<list2.size();i++)
       {
        System.out.println(list2.get(i));
       }
        

        
        
    }
   static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long>list=new ArrayList<Long>();
        for(int i=1;i<=n;i++)
        {
            long fact2=fact(i);
            if(fact2<=n)
            {
                list.add(fact2);
            }
            if(list.size()>3){
                break;
            }
            
            
        }
      
        
        return list;
        
    }
    static long fact(long n)
    {
        
        if(n==0)
        return 1;
        if(n==1)
        return 1;
        
        
        return n-1*fact(n-2);


        
        
    }
}

public class Prime {
    public static void main(String[] args) {
        
        System.out.println(factors(49, 30));
        
       

    }
    //  public static boolean prime(int n){
    //     int c=0;
    //     for(int i=1;i<=Math.sqrt(n);i++)
    //     {
    //         if(n%i==0){
    //             c++;
    //             if((n/i)!=i)
    //             {
    //                 c++;
    //             }
    //         }
    //     }
    //     if(c==2)return true;
    //     return false;

    //  }
     public static int factors(int a,int b){
        int c=1;
        int i=2;
        while(i<=a && i<=b){
            if((a%i==0) && (b%i==0)){
                c++;
            }
            i++;
        }
        return c;
     }
}

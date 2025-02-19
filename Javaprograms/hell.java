public class hell {
    public static void printnos(int n){
        if(n>0){
    
        printnos(n-1);
        System.out.println(n);
        }
    }
    public static void main(String args[]){
        printnos(10);    }
}

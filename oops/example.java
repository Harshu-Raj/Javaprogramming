package oops;

public class example {
    public static void main(String args[]){
        int a=5000;
        int b=6000;
        try
        {
            if(b>a){
            throw new ArithmeticException("Insufficient balance");
        }
        a=a-b;
        System.out.println("Transition successfully completed");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception:"+ e.getMessage());
        }
        
        System.out.println("program continewed");
    }
}

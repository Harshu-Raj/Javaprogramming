import java.util.*;
public class harry2 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double number=s.nextInt();
        if(number%1==0)
        {
            System.out.println("the number is integer");
        }
        else{
            System.out.println("not integer");
        }
    }
}

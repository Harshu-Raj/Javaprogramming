import java.util.*;
public class pallindrome {
    public static void main(String args[]){
        int count=0;

        Scanner sc=new Scanner(System.in);
        
       String name =sc.nextLine();

        for(int i=0 ;i<=name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-1-i))
            {
                count++;

            }            
           
        }
        if(count==1)
        {
            System.out.println(" not palindorme");
        }
        else{
            System.out.println("palindorme");
        }
    }
}

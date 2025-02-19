import java.util.*;
public class romantoint {
    static int value(char c){
        if(c=='I'){
            return 1;
        }
        if(c=='V'){
            return 5;
        }
        if(c=='X'){
            return 10;
        }
        if(c=='C'){
            return 100;
        }
        if(c=='D'){
            return 500;
        }
        if(c=='M'){
            return 1000;
        }
        if(c=='l'){
            return 50;
        }
        return -1;
    }
    int convertromantoint(String s){
        int total=0;
        int s1,s2;
        for(int i=0;i<s.length();i++){
            s1=value(s.charAt(i));
        
        if(i+1<s.length())
        {
             s2=value(s.charAt(i+1));
            if(s1>=s2)
            {
                total=total+s1;
            }
            else{
                total=total-s1;
            }

        }
        else
        {
            total =total+s1;
        }
       

    }
    return total;
    }
    public static void main(String args[]){
        romantoint ob=new romantoint();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any String form(I,V,X,M,L,D)");
            String s=sc.nextLine();
            System.out.println("corresponding integer value is:"+ob.convertromantoint(s));
            
            
    }
    }


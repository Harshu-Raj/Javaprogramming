import java.io.DataInputStream;
import java.io.DataInputStream.*;
class abc{
    public static void main(String args[]){
        DataInputStream in =new DataInputStream(System.in);
        String s1=new String();
        try{
            System.out.print("Interesting");
             s1 =in.readLine();

        }
        catch(Exception E){}
        int c=0;
        int l=s1.length();
        for(int i=0;i<l;i++){
          char x= s1.charAt(i);
            // if(x>=65 && x<=90){
            //     x= (char) (x+32);
            // }
            if(x =='a'|| x =='e'||x=='i'||x=='o'||x=='u'||x=='I')
                c=c+1;
            
          //  System.out.println(x);
        }
        System.out.println("NO of vowels ="+c);
    }
}
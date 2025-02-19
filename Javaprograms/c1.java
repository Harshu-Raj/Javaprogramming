import java.io.DataInputStream;
public class c1 {
    public static void main(String args[]){
        DataInputStream in =new DataInputStream(System.in);
        String s1=null;
        try{
            System.out.println("enter a string:");
            s1 =in.readLine();


        }
        catch(Exception e) {}
        int pos=s1.indexOf('H');
        System.out.println("position="+pos);
        
    }
    
}

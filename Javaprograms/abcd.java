import java.io.*;
public class abcd
 {
    public static void main(String args[])
    {
        DataInputStream in =new DataInputStream(System.in);
        byte b[]=new byte[50];
        try{
            for(int i=1;i<50;i++){
                b[i]=(byte) in.read();
            }
        }
        catch (Exception e) {}
        String S= new String(b);
        System.out.println(S);
        
    }
 }


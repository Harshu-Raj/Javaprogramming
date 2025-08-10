package oops;
import java.io.*;
public class ByteDemo {
    public static void main(String[] args) throws Exception{
        // byte b[]={'a','b','c','d','e','f','g','h'};

        // ByteArrayOutputStream bis=new ByteArrayOutputStream(20);
        // // int x;

        // bis.write('a');
        // bis.write('b');
        // bis.write('c');
        // bis.write('d');
        // bis.write('e');

        // byte b[]=bis.toByteArray();

        // for(byte x:b){
        //     System.out.println((char)x);
        // }

        // bis.writeTo(new FileOutputStream("byteexample.txt"));

        // String str=new String(bis.readAllBytes());

        // System.out.println(bis.markSupported());
        // while((x=bis.read())!=-1){
        //     System.out.print((char)x);
        // }
        // bis.close();
        char c[]={'a','b','c','d','e','f','g','h'};
        CharArrayReader cr=new CharArrayReader(c);
        int x;
        while((x=cr.read())!=-1){
            System.out.print((char)x);
        }

        cr.close();
        
    }
}

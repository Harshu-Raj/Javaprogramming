// package oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {

        try {
             FileReader fis=new FileReader("Test.txt");
            //  String str="Learn Java Programming";

            //  byte b[]=new byte[fis.available()];
            //  for(byte x:b){
            //     fos.write(x);
            //  }
            // //  fos.write(str.getBytes());

        //    fis.read(b);

        //    String str=new String(b);
        //    System.out.println(str);
        //    fis.close();

        int x;
        // do{
        //     x=fis.read();
        //     if(x!=-1)System.out.print((char)x);
        // }while(x!=-1);
            while((x=fis.read())!=-1){
                System.out.print((char)x);
            }




        } catch (Exception e) {
            System.out.println("Error:"+e);
        } 
       
    }
}

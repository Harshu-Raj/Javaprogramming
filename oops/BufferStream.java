package oops;

import java.io.*;
import java.nio.Buffer;

public class BufferStream {
    public static void main(String[] args) throws Exception {
        FileReader fis = new FileReader("Test.txt");
        BufferedReader bis = new BufferedReader(fis);

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.mark(10);
        // Mark the current position in the stream
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        System.out.println("String: " + bis.readLine());

        // int x;
        // while((x=bis.read())!=-1){
        // System.out.print((char)x);
        // }

        bis.close();
        fis.close();
        // System.out.println(fis.markSupported());
        // System.out.println(bis.markSupported());

    }

}

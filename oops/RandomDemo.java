package oops;

import java.io.RandomAccessFile;

public class RandomDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile rf=new RandomAccessFile("Test.txt","rw");

        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('z');
         System.out.println((char)rf.read());
          System.out.println((char)rf.read());
           System.out.println((char)rf.read());
        

        System.out.println((char)rf.read());
        rf.seek(3);


        System.out.println((char)rf.getFilePointer());


    }
    
}

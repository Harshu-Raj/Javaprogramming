package oops;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class StudentChallange {
    public static void main(String[] args) throws Exception {

    
        FileInputStream fis1=new FileInputStream("source1.txt");

        FileInputStream fis2=new FileInputStream("source2.txt");
        FileOutputStream fos=new FileOutputStream("Destination.txt");

        // int b;
        // while((b=fis.read())!=-1){
        //     if(b>=65 && b<=90)fos.write(b+32);
        //     else fos.write(b);
        // }

        SequenceInputStream seq=new SequenceInputStream(fis1, fis2);

        int b;
        while((b=seq.read())!=-1){
            fos.write(b);
        }

        seq.close();
        fis1.close();
        fis2.close();
        fos.close();

        
    }
}

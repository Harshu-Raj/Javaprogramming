
// package oops;
import java.io.File;

public class FileHandling {
    public static void main(String[] args) throws Exception {
        
        File f=new File("C:\\Users\\88097\\OneDrive\\Desktop\\java programming\\oops");
        System.err.println(f.isDirectory());
        File[]s =f.listFiles();

        for(File x:s){
            System.out.println(x.getName());
        }
    }

}

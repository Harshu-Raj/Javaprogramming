import java.io.FileOutputStream;
import java.io.PrintStream;

class Student{
    int rollno;
    String name;
    String dept;
}

public class PrintStreamDemo {
    public static void main(String[] args) throws Exception  {
        FileOutputStream fos=new FileOutputStream("student1.txt");

        PrintStream ps=new PrintStream(fos);
        Student s=new Student();
        s.rollno=10;
        s.name="Harsh";
        s.dept="IT";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();
    }
}

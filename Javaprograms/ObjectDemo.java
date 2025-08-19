
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable{
    private int rollno;
    private String name;
    private float avg;
    private String dept;

    public static int data=10;
    public Student1(){}
    public Student1(int r,String n,float a, String d){
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        data=500;
        
    }
    public String toString(){
        return "\nStudent Details\n"+
        "\nRoll No"+rollno+
        "\nName"+name+
        "\nAverage"+avg+
        "\nDepartment"+dept+
        "\nData"+data;
    }


}

// public class ObjectDemo {
//     public static void main(String[] args) throws Exception{
//         FileOutputStream fos=new  FileOutputStream("Serial.txt");
//         ObjectOutputStream oos=new ObjectOutputStream(fos);

//         System.out.println("Helloworld");
//         Student1 s=new Student1(10,"harsh",90.5f,"IT");

//         oos.writeObject(s);
//         oos.close();
//         fos.close();
        
//     }
// }


public class ObjectDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new  FileInputStream("Serial.txt");
        ObjectInputStream oos=new ObjectInputStream(fis);

        // System.out.println("Helloworld");
        Student1 s;

        s=(Student1)oos.readObject();
        System.out.println(s);

        fis.close();
        oos.close();
        
    }
}
import java.util.*;
public class harry1 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects:");
        int math=s.nextInt();
        int physics=s.nextInt();
        int chemistry=s.nextInt();
        int english=s.nextInt();
        int hindi=s.nextInt();
        float total=500;
        float percentage=((math+physics+chemistry+english+hindi)/total)*100;
        System.out.println("the total percentage of the student is "+percentage);
    }
}

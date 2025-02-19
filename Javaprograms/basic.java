public class basic{
    
    void show()
    {
        System.out.println("1");
    }
    void show(int a)
    {
        System.out.println("2");
    }


    public static void main(String args[])
    {
       basic  s1=new basic();
        s1.show();
        s1.show(10);
    }
}

public class abcde {
public static void main(String args[])
{
    pen p1=new pen();
    p1.setcolor("Red");
    System.out.println(p1.getcolor());
}
}
class pen{
    String color;
    int roll;
    String getcolor(){
        return this.color;
    }
    void setcolor(String newcolor)
    {
        this.color=newcolor;
    }
}
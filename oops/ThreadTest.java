package oops;

public class ThreadTest extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println(i+" Hello");

            i++;
        }
    }

    public static void main(String[] args) {
        ThreadTest t1=new ThreadTest();
        t1.start();
        int i=0;
        while(true){
            System.out.println(i+" World");
            i++;
        }
    }
}

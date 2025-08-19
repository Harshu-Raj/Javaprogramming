package oops;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.channels.Pipe;
import java.io.InputStream;


class Producer extends Thread {
    OutputStream os;
    public Producer(OutputStream o){
        // this.os=o;
        os=o;
    }

    public void run(){
        int count=1;
        while(true){
            try{
                os.write(count);
                os.flush();
                System.out.print("producer: "+count);
                System.out.flush();
                Thread.sleep(10);
                count++;


            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    InputStream is;
    public Consumer(InputStream s){
        // this.os=o;
        is=s;
    }

    public void run(){
        int x;

        while(true){
            try{
                x=is.read();
                System.out.print("Consumer: "+x );
                System.out.flush();

            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class PipedDemo {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis =new PipedInputStream();
        PipedOutputStream pos =new PipedOutputStream();
        pis.connect(pos);
        Producer p=new Producer(pos);
        Consumer c=new Consumer(pis);

        p.start();
        c.start();
        // p.terminate
    }
}

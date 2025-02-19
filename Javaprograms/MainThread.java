class TableThread extends Thread {
    private int tableNumber;

    public TableThread(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Thread for Table of " + this.tableNumber + " started.");

            for (int i = 1; i <= 10; i++) {
                System.out.println(this.tableNumber + " * " + i + " = " + (this.tableNumber * i));
            }

            System.out.println("Thread for Table of " + this.tableNumber + " finished.");
            this.notify(); 
        }
    }
}

public class MainThread {
    public static void main(String[] args) {
        
        TableThread thread2 = new TableThread(2);
        TableThread thread3 = new TableThread(3);
        TableThread thread4 = new TableThread(4);

        
        thread2.start();
        thread3.start();
        thread4.start();

       
        synchronized (thread2) {
            synchronized (thread3) {
                synchronized (thread4) {
                    System.out.println("Main thread started.");

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                    }

                    System.out.println("Main thread finished.");

                    try {
                        
                        thread2.wait();
                        thread3.wait();
                        thread4.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

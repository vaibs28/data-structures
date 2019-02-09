package multithreading;

public class DeadlockExample {

    Object lock1 = new Object();
    Object lock2 = new Object();
    
    public static void main(String[] args) throws InterruptedException {
        
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        
        t1.start();
        t2.start();
    }

}

class Thread1 extends Thread {
   
    public void run() {
        
    }
}

class Thread2 extends Thread {
    
    public void run() {
        
    }
    
}
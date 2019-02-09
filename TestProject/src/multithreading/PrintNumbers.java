package multithreading;

public class PrintNumbers {

    static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    static Object lock = new Object();

    public static void main(String[] args) {

        Thread t1 = new OddThread();
        Thread t2 = new EvenThread();

        t1.start();
        t2.start();

    }

}

class Print {

}

class OddThread extends Thread {

    public void run() {
        synchronized (PrintNumbers.lock) {

            for (int i = 0; i < PrintNumbers.arr.length; i = i + 2) {
                System.out.println("Odd thread:" + PrintNumbers.arr[i]);
                try {
                    PrintNumbers.lock.wait();

                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        }
    }
}

class EvenThread extends Thread {

    public void run() {
        synchronized (PrintNumbers.lock) {

            int i =1 ;
            while (i<PrintNumbers.arr.length && PrintNumbers.arr[i]%2 == 1) {
                try {
                    PrintNumbers.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i= i+2;
            }
            System.out.println("Even:"+PrintNumbers.arr[i]);
            PrintNumbers.lock.notify();
        }

    }
}
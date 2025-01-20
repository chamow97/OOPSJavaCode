// Creating a thread by extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                // Pause the thread for 500ms
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

// Creating a thread by implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                // Pause the thread for 500ms
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        // Create a thread using the Thread class
        MyThread thread1 = new MyThread();
        thread1.setName("Thread 1");

        // Create a thread using the Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.setName("Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Main thread execution
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Main Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }
        }
    }
}

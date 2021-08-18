import thread.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainThreadGroup = new ThreadGroup("main group");

        final Thread myThread1 = new MyThread(mainThreadGroup, "Поток 1");
        final Thread myThread2 = new MyThread(mainThreadGroup, "Поток 2");
        final Thread myThread3 = new MyThread(mainThreadGroup, "Поток 3");
        final Thread myThread4 = new MyThread(mainThreadGroup, "Поток 4");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        Thread.sleep(15000);

        mainThreadGroup.interrupt();
    }
}

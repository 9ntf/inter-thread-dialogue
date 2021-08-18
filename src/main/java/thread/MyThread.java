package thread;

public class MyThread extends Thread{

    public static final int THREAD_TIMEOUT = 2500;


    public MyThread(ThreadGroup mainThreadGroup, String name) {
        super(mainThreadGroup, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(THREAD_TIMEOUT);
                System.out.printf("Я поток %s Всем привет!\n", getName());
            }
        } catch (InterruptedException err) {
            System.out.println(err.getMessage());
        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}

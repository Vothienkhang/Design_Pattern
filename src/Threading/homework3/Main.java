package Threading.homework3;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("Main thread will be alive till the child thread is alive");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread has been interrupted");
        }
        System.out.println("Main thread has been terminated");
    }
}

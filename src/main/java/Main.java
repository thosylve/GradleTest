/**
 * Created by thss on 13-01-2015.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        final int loops = 10;
        final Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < loops; i++) {
                        System.out.println("Time now: " + System.currentTimeMillis());
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }

}

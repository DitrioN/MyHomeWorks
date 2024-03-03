package homeWork18;

import org.apache.log4j.Logger;

public class MyThread2 extends Thread {
    public static final Logger LOGGER = Logger.getLogger(MyThread1.class);
    boolean worked = true;
    @Override
    public void run () {
        int sum = 0;

        while (worked) {
            synchronized (Monitors.CHANGE) {
                try {
                    Monitors.CHANGE.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            LOGGER.debug(Main.num++ + " - я Поток" + getName());
            try {
                Thread.sleep(Main.delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (Monitors.CHANGE) {
                Monitors.CHANGE.notify();
            }

            sum++;
            if (sum >= Main.countOfRepeat) {
                worked = false;
            }
        }
    }
}

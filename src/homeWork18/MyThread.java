package homeWork18;

public class MyThread extends Thread {
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

            System.out.println(Main.num++ + " - я Поток ");
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

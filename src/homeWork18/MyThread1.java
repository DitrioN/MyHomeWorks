package homeWork18;

public class MyThread1 extends Thread {
    boolean worked = true;
    @Override
    public void run () {
        int sum = 0;

        while (worked) {
            System.out.println(Main.num++ + " - я Поток Вася");
            try {
                Thread.sleep(Main.delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (Monitors.CHANGE) {
                Monitors.CHANGE.notify();
            }

            synchronized (Monitors.CHANGE) {
                try {
                    Monitors.CHANGE.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            sum++;
            if (sum >= Main.countOfRepeat) {
                worked = false;
            }
        }
    }
}

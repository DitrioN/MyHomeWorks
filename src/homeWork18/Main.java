package homeWork18;

public class Main extends Thread {
    public static int num = 1;
    public static int countOfRepeat = 5;
    public static int delay = 1000;
    public static void main (String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        MyThread3 myThread3 = new MyThread3();

        myThread1.start();
        myThread2.start();
        myThread3.start();

        /*MyThread vasya = new MyThread();
        vasya.setName("Вася");
        MyThread richard = new MyThread();
        richard.setName("Ричард");
        MyThread treid = new MyThread();
        treid.setName("Трейд");

        vasya.start();
        richard.start();
        treid.start();*/
    }
}

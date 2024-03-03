package homeWork18;

public class Main extends Thread {
    public static int num = 1;
    public static int countOfRepeat = 5;
    public static int delay = 1000;
    public static void main (String[] args) {
        MyThread1 vasya = new MyThread1();
        MyThread2 richard = new MyThread2();
        richard.setName("Ричард");
        MyThread2 egor = new MyThread2();
        egor.setName("Егор");

        vasya.start();
        richard.start();
        egor.start();
    }
}

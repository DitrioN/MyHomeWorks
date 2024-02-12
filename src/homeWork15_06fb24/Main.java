package homeWork15_06fb24;

import org.testng.annotations.Test;

import java.awt.desktop.UserSessionEvent;
import java.util.LinkedList;

public class Main extends Thread {
    public static void main (String[] args) {
        LinkedList<String> listA = new LinkedList <>();
        listA.add("Скобы");
        listA.add("Карандаш");
        listA.add("Ручка");
        listA.add("Кнопка");
        listA.add("Степлер");

        System.out.println(new ListUtilsImpl().asList("Скобы", "Карандаш", "Ручка", "Кнопка", "Степлер"));

        LinkedList<Double> listB = new LinkedList <>();
        listB.add(10.0);
        listB.add(19.0);
        listB.add(5.0);
        listB.add(101.0);
        listB.add(57.0);

        System.out.println(new ListUtilsImpl().sortedList(listB));

        System.out.println(new SetUtilsImpl().customOrderSet(10, 15, 20, 25, 30));
    }
}

package homeWork14_02fb24;

import java.util.LinkedList;

public class Main {
    public static void main (String[] args) {
        double[][] matrixForA = {
                {11.25, 2, 27},
                {16, 25.0, 96},
                {64, 15, 135.0}
        };
        Matrix a = new Matrix(matrixForA);

        double[][] matrixForB = {
                {7.5, 4, 3},
                {128, 63.75, 99},
                {512, 0, 2.5}
        };
        Matrix b = new Matrix(matrixForB);

        LinkedList<Integer> listA = new LinkedList <>();
        listA.add(10);
        listA.add(20);
        listA.add(666);
        listA.add(30);

        LinkedList<Integer> listB = new LinkedList <>();
        listB.add(444);
        listB.add(10);
        listB.add(555);
        listB.add(666);

        for (Integer integer : new CollectionUtils().intersection(listA, listB)) {
            System.out.println(integer);
        }
    }
}

package homeWork14_02fb24;

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

        //b.printToConsole();
        //a.printToConsole();

        Matrix c = (Matrix) a.transpose();

        //c.printToConsole();

        double[][] matrixForD = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };

        Matrix d = new Matrix(matrixForD);

        System.out.println(d.isIdentityMatrix());
    }
}

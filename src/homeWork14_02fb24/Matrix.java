package homeWork14_02fb24;

public class Matrix implements IMatrix {

    double[][] data;

    public Matrix (double[][] data) {
        this.data = data;
    }

    public Matrix () {

    }

    public double[][] getData () {
        return data;
    }

    public void setData (double[][] data) {
        this.data = data;
    }

    @Override
    public int getRows () {
        return data.length;
    }

    @Override
    public int getColumns () {
        return data[0].length;
    }

    @Override
    public double getValueAt (int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (checkRange(rowIndex, colIndex)) {
            return data[rowIndex][colIndex];
        } else {
            return 0;
        }
    }

    @Override
    public void setValueAt (int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (checkRange(rowIndex, colIndex)) {
            data[rowIndex][colIndex] = value;
        }
    }

    @Override
    public IMatrix add (IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (checkMatrix(otherMatrix)) {
            Matrix result = new Matrix(new double[getRows()][getColumns()]);
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    result.setValueAt(i, j, otherMatrix.getValueAt(i, j) + this.getValueAt(i, j));
                }
            }
            return result;
        } else
            return null;
    }

    @Override
    public IMatrix sub (IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (checkMatrix(otherMatrix)) {
            Matrix result = new Matrix(new double[getRows()][getColumns()]);
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    result.setValueAt(i, j, Math.abs(otherMatrix.getValueAt(i, j) - this.getValueAt(i, j)));
                }
            }
            return result;
        } else
            return null;
    }

    @Override
    public IMatrix mul (IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (checkMatrix(otherMatrix)) {
            Matrix result = new Matrix(new double[getRows()][getColumns()]);
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    result.setValueAt(i, j, otherMatrix.getValueAt(i, j) * this.getValueAt(i, j));
                }
            }
            return result;
        } else
            return null;
    }

    @Override
    public IMatrix mul (double value) {
        Matrix result = new Matrix(new double[getRows()][getColumns()]);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result.setValueAt(i, j, value * this.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose () {
        Matrix result = new Matrix(new double[getRows()][getColumns()]);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return result;
    }

    @Override
    public void fillMatrix (double value) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant () {
        return 0;
    }

    @Override
    public boolean isNullMatrix () {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (getValueAt(i, j) != 0)
                    return false;
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix () {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i == j) {
                    if (getValueAt(i, j) != 1.0)
                        return false;
                } else {
                    if (getValueAt(i, j) != 0.0)
                        return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix () {
        return data.length == data[0].length;
    }

    @Override
    public void printToConsole () {
        StringBuilder str = new StringBuilder();
        for (double[] f1 : data) {
            str.append("\n");
            for (double f2 : f1) {
                str.append(f2).append(" ");
            }
        }
        System.out.println(str);
    }

    private boolean checkRange (int rowIndex, int colIndex) {
        if (rowIndex < this.getRows() && colIndex < this.getColumns())
            return true;
        else {
            System.out.println("Введённый индекс выходит за рамки массива.");
            return false;
        }
    }

    private boolean checkMatrix (IMatrix matrix) {
        if (matrix != null) {
            if (this.getRows() != matrix.getRows()
                    && this.getColumns() != matrix.getColumns()) {
                return true;
            } else {
                System.out.println("Размеры массива различаются.");
                return false;
            }
        } else {
            System.out.println("Введённый массив - null.");
            return false;
        }
    }
}

package org.example.prac_18;

public class Matrix<T extends Number> {
    private final int rows;
    private final int columns;
    private final T[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = (T[][]) new Number[rows][columns];
    }

    public void set(int row, int column, T value) {
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
            throw new IllegalArgumentException("Invalid row or column index");
        }
        data[row][column] = value;
    }

    public T get(int row, int column) {
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
            throw new IllegalArgumentException("Invalid row or column index");
        }
        return data[row][column];
    }

    public Matrix<T> add(Matrix<T> other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            throw new IllegalArgumentException("Matrix dimensions must match for addition");
        }

        Matrix<T> result = new Matrix<>(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                T sum = addNumbers(data[i][j], other.data[i][j]);
                result.set(i, j, sum);
            }
        }
        return result;
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (this.columns != other.rows) {
            throw new IllegalArgumentException("Number of columns in the first matrix must match the number of rows in the second matrix for multiplication");
        }

        Matrix<T> result = new Matrix<>(rows, other.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                T sum = multiplyAndSumRowColumn(i, j, other);
                result.set(i, j, sum);
            }
        }
        return result;
    }

    private T addNumbers(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(((Integer) a) + ((Integer) b));
        } else if (a instanceof Double) {
            return (T) Double.valueOf(((Double) a) + ((Double) b));
        } else {
            throw new IllegalArgumentException("Unsupported data type for addition");
        }
    }

    private T multiplyAndSumRowColumn(int row, int column, Matrix<T> other) {
        T sum = null;

        for (int k = 0; k < this.columns; k++) {
            T product = multiplyNumbers(this.get(row, k), other.get(k, column));
            if (sum == null) {
                sum = product;
            } else {
                sum = addNumbers(sum, product);
            }
        }

        return sum;
    }

    private T multiplyNumbers(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(((Integer) a) * ((Integer) b));
        } else if (a instanceof Double) {
            return (T) Double.valueOf(((Double) a) * ((Double) b));
        } else {
            throw new IllegalArgumentException("Unsupported data type for multiplication");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sb.append(data[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}


package PractWork_18.task4;

import java.sql.SQLOutput;

public class Matrix <T> {
    private T[][] matrice;

    public Matrix(T[][] matrice) {
        this.matrice = matrice;
    }

    public T getElement(int row, int column) {
        return matrice[row][column];
    }

    public void setElement(int row, int column, T elenent) {
        matrice[row][column] = elenent;
    }

    public void printMatrice() {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++)
            {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addition(T[][] matrice) {
        try {
            if ((matrice.length != this.matrice.length) || (matrice[0].length != this.matrice[0].length)) {
                throw new IllegalArgumentException("Sizes of matrices are not equals");
            }
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[i].length; j++) {
                    if (matrice[i][j] instanceof Number)
                        this.matrice[i][j] = (T) add((Number)this.matrice[i][j], (Number)matrice[i][j]);
                    if (matrice[i][j] instanceof String)
                        this.matrice[i][j] = (T) ((String) this.matrice[i][j]).concat((String) matrice[i][j]);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private Number add(Number a, Number b) {
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() + b.doubleValue();
        } else {
            return a.intValue() + b.intValue();
        }
    }

    public static void main(String[] args) {
        Integer[][] intMatrice = {
                {2, 5, 4},
                {4, 1, 7},
                {9, 3, 1}};

        String[][] strMatrice = {
                {"E", "E", "E"},
                {"E", "E", "E"},
                {"E", "E", "E"}};

        Integer[][] newIntMatrice = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}};

        String[][] newStrMatrice = {
                {"Z", "Z", "Z"},
                {"Z", "Z", "Z"},
                {"Z", "Z", "Z"}};

        Matrix<Integer> intMatrixObj = new Matrix<>(intMatrice);
        intMatrixObj.printMatrice();

        System.out.println();

        Matrix<String> strMatrixObj = new Matrix<>(strMatrice);
        strMatrixObj.printMatrice();

        System.out.println();

        intMatrixObj.addition(newIntMatrice);
        intMatrixObj.printMatrice();

        System.out.println();

        strMatrixObj.addition(newStrMatrice);
        strMatrixObj.printMatrice();
    }
}

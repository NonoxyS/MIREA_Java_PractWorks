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

    public static void main(String[] args) {
        Integer[][] intMatrice = {
                {2, 5, 4},
                {4, 1, 7},
                {9, 3, 1}};

        String[][] strMatrice = {
                {"E", "E", "E"},
                {"E", "E", "E"},
                {"E", "E", "E"}};

        Matrix<Integer> intMatrixObj = new Matrix<>(intMatrice);
        intMatrixObj.printMatrice();

        System.out.println();

        Matrix<String> strMatrixObj = new Matrix<>(strMatrice);
        strMatrixObj.printMatrice();
    }
}

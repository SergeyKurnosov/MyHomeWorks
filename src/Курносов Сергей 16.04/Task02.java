package homework;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int[][] matrix = {
                {65, 56, 1},
                {-78, 2, 0},
                {12, 3656, 32},
                {13, 78, 41},
                {62, 19, 99}
        };
        System.out.println(Arrays.deepToString(returnSortyMatrix(matrix)));
        System.out.println("Количество элементов в данном массиве - " + numbersOfElementsOfMatrix(matrix));
        int countMatrix = numbersOfElementsOfMatrix(matrix);
        averageValueOfMatrix(matrix, countMatrix);
    }

    //----------------------------------------------------------------------------
    //Сортитруем наш массив
    private static int[][] returnSortyMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix[k].length; l++) {
                        if (matrix[i][j] < matrix[k][l]) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }
                    }
                }
            }
        }
        return matrix;
    }

    //---------------------------------------------------------------------------------
    //Подсчитываем кол-во цифр в массиве
    private static int numbersOfElementsOfMatrix(int[][] matrix) {
        int check = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                check++;
            }
        }
        return check;
    }

    //---------------------------------------------------------------------------
    //Находим и выводим средний элемент (подходит для массивов как с четным так и с нечетным количеством элементов)
    public static void averageValueOfMatrix(int[][] matrix, int countMatrix) {
        if (countMatrix % 2 == 1) {
            int weight = countMatrix / matrix.length;
            int indexI = matrix.length / 2;
            int indexJ = weight / 2;
            System.out.println("Средний элемент в данном массиве - " + matrix[indexI][indexJ]);
        } else if (countMatrix % 2 == 0) {
            int weight = countMatrix / matrix.length;
            int check = 0;
            double firstNumber = 0;
            double secondNumber = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    check++;
                    if (check == 10) {
                        firstNumber = matrix[i][j];
                    } else if (check == 11) {
                        secondNumber = matrix[i][j];
                    }
                }
            }
            System.out.println("Первое из двух чисел , расположенное посередине - " + firstNumber);
            System.out.println("Второе из двух чисел , расположенное посередине - " + secondNumber);
            double result = (firstNumber + secondNumber) / 2;
            if (result > (int) result) {
                System.out.println("Среднее ЗНАЧЕНИЕ элементов данного массива - " + result);
            } else {
                System.out.println("Среднее ЗНАЧЕНИЕ элементов данного массива - " + (int) result);
            }
        }
    }
}

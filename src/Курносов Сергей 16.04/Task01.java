package homework;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[][] matrix = {
                {23, 53, 66},
                {2, 23, 94},
                {-1, 7, 88}
        };
        System.out.println("Минимальное значение данного массива (1 способ) = " + getMin(matrix));// 1 способ (перебираем массив и находим мин. элемент)
        System.out.println("----------------------------------------------------------------------------------");
        Arrays.sort(matrix, (a, b) -> a[0] - b[0]); // 2 способ (сортируем массив командой и выводим первый элемент)
        System.out.println("Наш отсортированный массив для 2 способа " + Arrays.deepToString(matrix)); // выводим отсортированный массив ↑ ↑ ↑
        System.out.println("Минимальное значение данного массива (2 способ) = " + matrix[0][0]);
    }

    //-------------------------------------------------------------------------
    //Перебираем массив , 1 способ
    private static int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }
}

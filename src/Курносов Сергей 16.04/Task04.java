package homework;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        int[][] matrix = {
                {93, 75, 936, 66},
                {83, 763, 53, 88},
                {935, 88, 1, 13}
        };
        int placeInTheArrayFromTheEnd = 2; // число находится на 2 месте от конца в отсортированном массиве
        System.out.println(Arrays.deepToString(returnSortmatrix(matrix)));
        int count = returnVariablematrix(matrix);
        int weightArray = count / matrix.length;
        System.out.println("↓ Второе максимальное число ↓");
        System.out.println(matrix[matrix.length - 1][weightArray - placeInTheArrayFromTheEnd]); //Работает в том случае , если это число находится в последней строке
    }

    //-----------------------------------------------------------------------------
    //Сортитруем наш массив
    private static int[][] returnSortmatrix(int[][] matrix) {
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

    //-----------------------------------------------------------------------------
    //Подсчитываем количество цифр
    private static int returnVariablematrix(int[][] matrix) {
        int check = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                check++;
            }
        }
        return check;
    }
}

package homework;

public class Task03 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println("Сумма элементов побочной диагонали = " + returnSum(matrix));

    }

    private static int returnSum(int[][] matrix) {
        int sum = 0;
        int indexI = 0;
        int indexJ = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == indexJ) {
                    sum = sum + matrix[indexI][indexJ];
                    indexI++;
                    indexJ--;
                }
            }
        }
        return sum;
    }

}